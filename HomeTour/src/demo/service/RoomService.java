package demo.service;

import java.util.HashMap;
import java.util.Map;

import demo.model.Room;

public class RoomService {

	public Room[] room;
	
	public RoomService() {

	}
	
	
	Map<Integer, String> direction = new HashMap<>();

	// Map directions
	public void setDirections () {	
	direction.put(1, "North");
	direction.put(2, "South");
	direction.put(3, "East");
	direction.put(4, "West");
	}

	//set room direction
	public void rooms(Room [] discription) {
		
		this.room = discription;
	}
	
	
	
	
}
