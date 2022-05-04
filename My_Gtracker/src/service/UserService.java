/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import connexion.Connexion;
import dao.IDao;
import entities.User;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yassi
 */
public class UserService implements IDao<User> {
    
@Override
    public boolean create(User o) {
        try {
            String req = "insert into user values (null, ?,?,?)";
            PreparedStatement pr = Connexion.getConnection().prepareStatement(req);
           
            pr.setString(1, o.getUsername());
            pr.setString(2, o.getCin());
            pr.setString(3, o.getPassword());
            
            if (pr.executeUpdate() != 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false;
    }

    @Override
    public boolean update(User o) {
        try {
            String req = "update user set username = ?, cin = ?, password = ? where id = ?";
            PreparedStatement pr = Connexion.getConnection().prepareStatement(req);
            pr.setString(1, o.getUsername());
            pr.setString(2, o.getCin());
            pr.setString(3, o.getPassword());
            pr.setInt(4, o.getId());
            if (pr.executeUpdate() != 0) {
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    @Override
    public boolean delete(User o) {
        try {
            String req = "delete from user where id = ?";
            PreparedStatement pr = Connexion.getConnection().prepareStatement(req);
            pr.setInt(1, o.getId());
            if (pr.executeUpdate() != 0) {
                return true;
            }
        } catch (SQLException e) {
            
        }
        return false;
    }

    @Override
    public User findById(int id) {
        try {
            String req = "select * from user where id = ?";
            PreparedStatement pr = Connexion.getConnection().prepareStatement(req);
            pr.setInt(1, id);
            ResultSet rs = pr.executeQuery();
            if (rs.next()) {
                return new User(rs.getInt("id"), rs.getString("username"), rs.getString("cin"), rs.getString("password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<User> findAll() {
        List<User> users = new ArrayList<User>();
        try {
            String req = "select * from user";
            PreparedStatement pr = Connexion.getConnection().prepareStatement(req);
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                users.add(new User(rs.getInt("id"), rs.getString("username"), rs.getString("cin"), rs.getString("password")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }

}
