package service;

import java.sql.ResultSet;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import connexion.Connexion;
import dao.IDao;
import entities.*;


public class VehiculeGPSTrackerService implements IDao<VehiculeGPSTracker> {

	
	private TrackerService ts = new TrackerService();
	private VehiculeService vs = new VehiculeService();
	
	@Override
	public boolean create(VehiculeGPSTracker o) {
		try {
			String req = "insert into vehiculegpstracker values (null,?, ?, ? , ?)";
			PreparedStatement pr = Connexion.getConnection().prepareStatement(req);
			pr.setDate(1, new Date(o.getDateDebut().getTime()));
			pr.setDate(2, null);
			pr.setInt(3, o.getTracker().getId());
			pr.setInt(4, o.getVehicule().getId());
			if (pr.executeUpdate() != 0)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return false;
	}

	@Override
	public boolean update(VehiculeGPSTracker o) {
		try {
			String req = "update vehiculegpstracker set dateFin = ? where id = ?";
			PreparedStatement pr = Connexion.getConnection().prepareStatement(req);
			pr.setDate(1, new Date(o.getDateFin().getTime()));
			pr.setInt(2, o.getId());
			if (pr.executeUpdate() != 0)
				return true;
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}

	@Override
	public boolean delete(VehiculeGPSTracker o) {
		try {
			String req = "delete from vehiculegpstracker where id = ?";
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

	
	public VehiculeGPSTracker findById(int id) {
		try {
			String req = "select * from vehiculegpstracker where id = ?";
			PreparedStatement pr = Connexion.getConnection().prepareStatement(req);
			pr.setInt(1, id);
			ResultSet rs = pr.executeQuery();
			if (rs.next())
				return new VehiculeGPSTracker(rs.getInt("id"),rs.getDate("dateDebut"),rs.getDate("dateFin"),
						ts.findById(rs.getInt("idTracker")),vs.findById(rs.getInt("idVehicule")));
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
public List<VehiculeGPSTracker> findAllAffect() {
      List<VehiculeGPSTracker> vt = new ArrayList<VehiculeGPSTracker>();
        try {
            PreparedStatement pr = Connexion.getConnection().prepareStatement("select * from vehiculegpstracker  where dateFin is not null");

            ResultSet rs = pr.executeQuery();

            while (rs.next()) {
                vt.add(new VehiculeGPSTracker(rs.getInt("id"),rs.getDate("dateDebut"), rs.getDate("dateFin"),ts.findById(rs.getInt("idTracker")) ,
                        vs.findById(rs.getInt("idVehicule"
                                + ""))));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vt;
    }

	 public List<VehiculeGPSTracker> findAll() {
      List<VehiculeGPSTracker> vt = new ArrayList<VehiculeGPSTracker>();
        try {
            PreparedStatement pr = Connexion.getConnection().prepareStatement("select * from vehiculegpstracker  where dateFin is null");

            ResultSet rs = pr.executeQuery();

            while (rs.next()) {
                vt.add(new VehiculeGPSTracker(rs.getInt("id"),rs.getDate("dateDebut"), rs.getDate("dateFin"),ts.findById(rs.getInt("idTracker")) ,
                        vs.findById(rs.getInt("idVehicule"))));
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return vt;
    }
        

public List<Position> findGPSTrackersBetweenDates(Vehicule vehicule, java.util.Date dateDebut, java.util.Date dateFin) {
    
TrackerService ts = new TrackerService();
List<Position> positions = new ArrayList<Position>();
try {
String req = "select p.* from vehicule v inner join vehiculegpstracker vt on v.id =vt.idVehicule inner join tracker t on t.id=vt.idTracker inner join position p on p.id =t.id where v.id=? and vt.dateDebut between ? and ? ";
PreparedStatement pr = Connexion.getConnection().prepareStatement(req);
pr.setInt(1, vehicule.getId());
pr.setDate(2, new Date(dateDebut.getTime()));
pr.setDate(3, new Date(dateFin.getTime()));
ResultSet rs = pr.executeQuery();
while (rs.next()) {
positions.add(new Position(rs.getInt("id"), rs.getDouble("latitude"), rs.getDouble("longitude"),rs.getDate("date"), ts.findById(rs.getInt("idTracker"))));
}
} catch (SQLException e) {
e.printStackTrace();
}
return positions;
}

    
public List<Tracker> findTrackerBetweenDates(Vehicule vehicule, java.util.Date dateDebut, java.util.Date dateFin) {
    
TrackerService ts = new TrackerService();
List<Tracker> tracker = new ArrayList<Tracker>();
try {
String req = "select t.* from vehicule v inner join vehiculegpstracker vt on v.id =vt.idVehicule inner join tracker t on t.id=vt.idTracker where v.id=? and vt.dateDebut between ? and ? ";
PreparedStatement pr = Connexion.getConnection().prepareStatement(req);
pr.setInt(1, vehicule.getId());
pr.setDate(2, new Date(dateDebut.getTime()));
pr.setDate(3, new Date(dateFin.getTime()));
ResultSet rs = pr.executeQuery();
while (rs.next()) {
tracker.add(new Tracker(rs.getInt("id"), rs.getString("simNumber")));
}
} catch (SQLException e) {
e.printStackTrace();
}
return tracker;
}


}
