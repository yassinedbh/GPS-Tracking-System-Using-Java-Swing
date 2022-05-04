package entities;

public class Vehicule {
	private int id;
	private String matricule;
	private String marque;
	private String type;
	public Vehicule(int id, String matricule, String marque, String type) {
		this.id = id;
		this.matricule = matricule;
		this.marque = marque;
		this.type = type;
		
	}
	public Vehicule(String matricule, String marque, String type) {
		super();
		this.matricule = matricule;
		this.marque = marque;
		this.type = type;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getMarque() {
		return marque;
	}
	public void setMarque(String marque) {
		this.marque = marque;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Vehicule [id=" + id + ", matricule=" + matricule 
				+ "]";
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
        final Vehicule other = (Vehicule) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
	
        
        
        
}
