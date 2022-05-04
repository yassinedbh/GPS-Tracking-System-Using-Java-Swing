 package test;

import java.util.Date;

import entities.Vehicule;
import service.VehiculeService;



public class TestVehicule {
	public static void main(String[] args) {
		VehiculeService vs = new VehiculeService();
		
		vs.create(new Vehicule("12352-a-26","Dacia","Hybride"));
		vs.create(new Vehicule("78523-d-1","Renault","Hybride"));
		vs.create(new Vehicule("41235-b-10","Fiat","Hybride"));
		vs.create(new Vehicule("52599-o-34","Ford","Hybride"));

		for(Vehicule v : vs.findAll()) {
			System.out.println(v);
		}
	}
}
