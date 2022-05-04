package entities;

import java.util.Date;

public class VehiculeGPSTracker {
	private int id; 
	private Date dateDebut;
	private Date dateFin;
	private Tracker tracker;
	private Vehicule vehicule;
	public VehiculeGPSTracker(int id,Date dateDebut, Date dateFin, Tracker tracker, Vehicule vehicule) {
		super();
		this.id = id;
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.tracker = tracker;
		this.vehicule = vehicule;
	}
        public VehiculeGPSTracker(Date dateDebut, Date dateFin, Tracker tracker, Vehicule vehicule) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
		this.tracker = tracker;
		this.vehicule = vehicule;
	}
        public VehiculeGPSTracker() {
	}
	
	public int getId() {
		return id;
	}

	public VehiculeGPSTracker(Date dateDebut, Date dateFin) {
		super();
		this.dateDebut = dateDebut;
		this.dateFin = dateFin;
	}

	public Date getDateDebut() {
		return dateDebut;
	}
	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}
	public Date getDateFin() {
		return dateFin;
	}
	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}
	public Tracker getTracker() {
		return tracker;
	}
	public void setTracker(Tracker tracker) {
		this.tracker = tracker;
	}
	public Vehicule getVehicule() {
		return vehicule;
	}
	public void setVehicule(Vehicule vehicule) {
		this.vehicule = vehicule;
	}
	@Override
	public String toString() {
		return "VehiculeGpsTracker [dateDebit=" + dateDebut + ", dateFin=" + dateFin + ", tracker=" + tracker
				+ ", vehicule=" + vehicule + "]";
	}

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + this.id;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final VehiculeGPSTracker other = (VehiculeGPSTracker) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
	
	
	
}
