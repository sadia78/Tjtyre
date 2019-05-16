package com.htm.room.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity

public class Room_Master {
	@Id
	private String roomType;
	private String facilities;
	private String cheeckiType;
	private String checkInTime;
	public String getRoomType() {
		return roomType;
	}
	public void setRoomType(String roomType) {
		this.roomType = roomType;
	}
	public String getFacilities() {
		return facilities;
	}
	public void setFacilities(String facilities) {
		this.facilities = facilities;
	}
	public String getCheeckiType() {
		return cheeckiType;
	}
	public void setCheeckiType(String cheeckiType) {
		this.cheeckiType = cheeckiType;
	}
	public String getCheckInTime() {
		return checkInTime;
	}
	public void setCheckInTime(String checkInTime) {
		this.checkInTime = checkInTime;
	}
	

}
