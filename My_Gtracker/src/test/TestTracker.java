package test;
import entities.Tracker;
import service.*;
public class TestTracker {

	public static void main(String[] args) {
		TrackerService ts=new TrackerService();
		ts.create(new Tracker("1452"));
		ts.create(new Tracker("4552"));
		ts.create(new Tracker("14992"));
		for(Tracker t:ts.findAll()) {
			System.out.println(t);
		}

	}

}
