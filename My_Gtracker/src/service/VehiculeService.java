package service;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connexion.Connexion;
import dao.IDao;
import entities.Vehicule;

public class VehiculeService implements IDao<Vehicule>{

	@Override
	public boolean create(Vehicule o) {
		try {
			String req = "insert into Vehicule values (null, ?, ?, ?)";
			PreparedStatement pr = Connexion.getConnection().prepareStatement(req);
			pr.setString(1, o.getMatricule());
			pr.setString(2, o.getMarque());
			pr.setString(3, o.getType());
			if (pr.executeUpdate() != 0)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean update(Vehicule o) {
		try {
			String req = "update Vehicule set Matricule = ?, marque = ?, type = ?  where id = ?";
			PreparedStatement pr = Connexion.getConnection().prepareStatement(req);
			pr.setString(1, o.getMatricule());
			pr.setString(2, o.getMarque());
			pr.setString(3, o.getType());
			pr.setInt(4, o.getId());
			if (pr.executeUpdate() != 0)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(Vehicule o) {
		try {
			String req = "delete from Vehicule where id = ?";
			PreparedStatement pr = Connexion.getConnection().prepareStatement(req);
			pr.setInt(1, o.getId());
			if (pr.executeUpdate() != 0)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public Vehicule findById(int id) {
		try {
			String req = "select * from Vehicule where id = ?";
			PreparedStatement pr = Connexion.getConnection().prepareStatement(req);
			pr.setInt(1, id);
			ResultSet rs = pr.executeQuery();
			if (rs.next())
				return new Vehicule(rs.getInt("id"), rs.getString("Matricule"), rs.getString("marque"),rs.getString("type"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public List<Vehicule> findAll() {
		List<Vehicule> vehicules = new ArrayList<Vehicule>();
		try {
			String req = "select * from Vehicule";
			PreparedStatement pr = Connexion.getConnection().prepareStatement(req);
			ResultSet rs = pr.executeQuery();
			while (rs.next())
				vehicules.add(new Vehicule(rs.getInt("id"), rs.getString("Matricule"), rs.getString("marque"),rs.getString("type")));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return vehicules;
	}

}
