package service;
import entities.*;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connexion.Connexion;
import dao.IDao;

public class TrackerService implements IDao<Tracker>{

	@Override
	public boolean create(Tracker o) {
		try {
			String req="insert into tracker values (null,?)";// id=null vu qu'on a la marque comme auto increment
			PreparedStatement pr=Connexion.getConnection().prepareStatement(req); //L'interface PreparedStatement ajoute la possibilit� de param�trer des requ�tes SQL. Les instances de PreparedStatement s'utilisent quand une m�me requ�te doit �tre ex�cut�e plusieurs fois, avec des param�tres diff�rents. La cha�ne de caract�res SQL contient donc des marqueurs, qui seront remplac�s par des valeurs � chaque ex�cution.et �vitera les attaques par injection de code SQL.
			pr.setString(1,o.getSimNumber());  //L'interface PreparedStatement propose un jeu de m�thode set<Type>(int, valeur) : setInt(int, int), setFloat(int, float), setString(int, String), etc... Chacune de ces m�thodes peut �tre appel�e pour fixer la valeur d'un param�tre donn�. le 1 represente la premiere varible qui va etre affecter a ?
			if(pr.executeUpdate() != 0)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean delete(Tracker o) {
		try {
			String req="delete from tracker where id = ?";// id=null vu qu'on a la marque comme auto increment
			PreparedStatement pr=Connexion.getConnection().prepareStatement(req); //L'interface PreparedStatement ajoute la possibilit� de param�trer des requ�tes SQL. Les instances de PreparedStatement s'utilisent quand une m�me requ�te doit �tre ex�cut�e plusieurs fois, avec des param�tres diff�rents. La cha�ne de caract�res SQL contient donc des marqueurs, qui seront remplac�s par des valeurs � chaque ex�cution.et �vitera les attaques par injection de code SQL.
			pr.setInt(1,o.getId());
			if(pr.executeUpdate() != 0)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public boolean update(Tracker o) {
		try {
			String req="update tracker set simNumber = ? where id = ?";// id=null vu qu'on a la marque comme auto increment
			PreparedStatement pr=Connexion.getConnection().prepareStatement(req); //L'interface PreparedStatement ajoute la possibilit� de param�trer des requ�tes SQL. Les instances de PreparedStatement s'utilisent quand une m�me requ�te doit �tre ex�cut�e plusieurs fois, avec des param�tres diff�rents. La cha�ne de caract�res SQL contient donc des marqueurs, qui seront remplac�s par des valeurs � chaque ex�cution.et �vitera les attaques par injection de code SQL.
			pr.setString(1,o.getSimNumber());  //L'interface PreparedStatement propose un jeu de m�thode set<Type>(int, Type) : setInt(int, int), setFloat(int, float), setString(int, String), etc... Chacune de ces m�thodes peut �tre appel�e pour fixer la valeur d'un param�tre donn�. le 1 represente la premiere varible qui va etre affecter a ?
			pr.setInt(2,o.getId());
			if(pr.executeUpdate() != 0)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return false;
	}

	@Override
	public Tracker findById(int id) {
		try {
			String req="select * from tracker where id = ?";// id=null vu qu'on a la marque comme auto increment
			PreparedStatement pr=Connexion.getConnection().prepareStatement(req); //L'interface PreparedStatement ajoute la possibilit� de param�trer des requ�tes SQL. Les instances de PreparedStatement s'utilisent quand une m�me requ�te doit �tre ex�cut�e plusieurs fois, avec des param�tres diff�rents. La cha�ne de caract�res SQL contient donc des marqueurs, qui seront remplac�s par des valeurs � chaque ex�cution.et �vitera les attaques par injection de code SQL.
		 //L'interface PreparedStatement propose un jeu de m�thode set<Type>(int, Type) : setInt(int, int), setFloat(int, float), setString(int, String), etc... Chacune de ces m�thodes peut �tre appel�e pour fixer la valeur d'un param�tre donn�. le 1 represente la premiere varible qui va etre affecter a ?
			pr.setInt(1,id);
			ResultSet rs=pr.executeQuery(); // on stocke le resultat de la requete avec resultset  -- execute query pour les requetes select
			if(rs.next()) //?????????????????????????
				return new Tracker(rs.getInt("id"),rs.getString("simNumber"));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return null;
	}

	@Override
	public List<Tracker> findAll() {
		List <Tracker> trackers =new ArrayList<Tracker>();
		try {
			String req="select * from tracker";
			PreparedStatement pr=Connexion.getConnection().prepareStatement(req); 
			ResultSet rs=pr.executeQuery(); // on stocke le resultat de la requete avec resultset
			while(rs.next()) //?????????????????????????
				trackers.add(new Tracker(rs.getInt("id"),rs.getString("simNumber")));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return trackers;
	}

}
