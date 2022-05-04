package entities;

public class Tracker {
	private int id;
	private String simNumber;

	public Tracker(String simNumber) {
		super();
		this.simNumber = simNumber;
	}

	public Tracker(int id, String simNumber) {
		super();
		this.id = id;
		this.simNumber = simNumber;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getSimNumber() {
		return simNumber;
	}

	public void setSimNumber(String simNumber) {
		this.simNumber = simNumber;
	}

	@Override
	public String toString() {
		return simNumber;
	}

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 79 * hash + this.id;
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
        final Tracker other = (Tracker) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
        
        
}
