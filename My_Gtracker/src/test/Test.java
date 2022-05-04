package test;

import java.sql.SQLException;
import java.sql.Statement;

import connexion.Connexion;


public class Test {
   public static void main(String[] args) {
	try {
		Connexion.getConnection(); // tester la connexion avec la base si il ne retourne pas d'exeption donc sa marche
		String TTracker = "create table tracker ("
								+ "id int primary key auto_increment,"
								+ "simNumber varchar(20));";
		String TPosition = "create table position ("
				+ "id int primary key auto_increment,"
				+ "latitude double,"
				+ "longitude double,"
				+ "date date,"
				+ "idTracker int);";
		String fk="alter table position add "
				+ "constraint fk foreign key (idTracker)"
				+ "references tracker(id)on delete cascade on update cascade;";

		String TVehicule = "create table vehicule ("
				+ "id int primary key auto_increment,"
				+ "matricule varchar(20),"
				+ "marque varchar(20),"
				+ "type varchar(20));";
		String TVehiculeGPSTracker = "create table vehiculegpstracker ("
				+ "id int primary key auto_increment,"
				+ "dateDebut Date,"
				+ "dateFin Date,"
				+ "idTracker int,"
				+ "idVehicule int);";
		String fk2="alter table vehiculegpstracker add "
				+ "constraint fk2 foreign key (idTracker)"
				+ "references tracker(id) on delete cascade on update cascade;";
		String fk3="alter table vehiculegpstracker add "
				+ "constraint fk3 foreign key (idVehicule)"
				+ "references vehicule(id) on delete cascade on update cascade;";
		String TUser = "create table user ("
								+ "id int primary key auto_increment,"
                                                                + "username varchar(20),"
								+ "cin varchar(20),"
                                                                + "password varchar(20));";
		
		
		Statement st =Connexion.getConnection().createStatement(); //Un objet de type Statement permet d�envoyer une requ�te SQL � la base de donn�es, et de r�cup�rer un r�sultat de requ�te, stock� dans un objet de type ResultSet.
		st.executeUpdate("drop table if exists position");//utiliser pour avoir une nouvelle base a chaque fois qu'on compile le programme 
		st.executeUpdate("drop table if exists vehiculegpstracker");
		st.executeUpdate("drop table if exists tracker");
		st.executeUpdate("drop table if exists vehicule");// execute utiliser pour les requetes
                st.executeUpdate("drop table if exists user");
		st.executeUpdate(TTracker);//executer les requetes de update create delete update
		st.executeUpdate(TPosition);
		st.executeUpdate(fk);//executer la requete
		st.executeUpdate(TVehicule);
		st.executeUpdate(TVehiculeGPSTracker);//executer les requetes de update create delete update
		st.executeUpdate(fk2);
		st.executeUpdate(fk3);
		st.executeUpdate(TUser);
		
	} catch (SQLException e) {
		e.printStackTrace();
		System.out.println("error here");
	}
}
}
