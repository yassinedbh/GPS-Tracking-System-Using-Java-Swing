	package test;

import java.util.Date;

import entities.Position;
import service.PositionService;
import service.TrackerService;

public class TestPosition {

	public static void main(String[] args) {
		TrackerService t = new TrackerService();
		PositionService p = new PositionService();
		p.create(new Position(20, -9, new Date(), t.findById(1)));
		p.create(new Position(40, -8, new Date(), t.findById(2)));
		p.create(new Position(60, -2, new Date("2021/10/22"), t.findById(2)));
		
		for(Position ps : p.findAll()) {
			System.out.println(ps);
		}
	}

}

//select p.* from position p inner join tracker t on p.id = t.id where t.id=? and p.date between ? and ?