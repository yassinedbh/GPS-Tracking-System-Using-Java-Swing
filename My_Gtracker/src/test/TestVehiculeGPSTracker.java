package test;

import java.util.Date;

import entities.Position;
import entities.Tracker;
import entities.Vehicule;
import entities.VehiculeGPSTracker;
import service.TrackerService;
import service.VehiculeGPSTrackerService;
import service.VehiculeService;

public class TestVehiculeGPSTracker {
	public static void main(String[] args) {
		
		VehiculeService vs = new VehiculeService() ;
		VehiculeGPSTrackerService vgs = new VehiculeGPSTrackerService() ;
		TrackerService ts = new TrackerService();
		
		vgs.create (new VehiculeGPSTracker ( new Date("2020/01/01"), new Date("2020/04/30") ,ts.findById(1), vs.findById(1)));
		System.out.println();
		for(VehiculeGPSTracker v : vgs.findAll()) {
			System.out.println(v);
		}
	}
}
