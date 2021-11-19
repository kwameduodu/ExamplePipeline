package demo.model;

import java.util.Objects;

public class Room {
	
	
	public String locationl;
	public String currentLocation;
	
	public Room() {
		super();
	}

	public Room(String locationl, String currentLocation) {
		super();
		this.locationl = locationl;
		this.currentLocation = currentLocation;
	}
	

	public String getLocationl() {
		return locationl;
	}

	public void setLocationl(String locationl) {
		this.locationl = locationl;
	}

	public String getCurrentLocation() {
		return currentLocation;
	}

	public void setCurrentLocation(String currentLocation) {
		this.currentLocation = currentLocation;
	}

	
	
	@Override
	public int hashCode() {
		return Objects.hash(currentLocation, locationl);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Room other = (Room) obj;
		return Objects.equals(currentLocation, other.currentLocation) && Objects.equals(locationl, other.locationl);
	}
	
	@Override
	public String toString() {
		return "Room [locationl=" + locationl + ", currentLocation=" + currentLocation + "]";
	}

}
