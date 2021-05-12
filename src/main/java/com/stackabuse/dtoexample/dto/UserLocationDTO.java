package com.stackabuse.dtoexample.dto;
//Let's make a Data Transfer Object to only transfer the required information. And while we're at it
// , let's aggregate the User and Location information, so that the data is transferred together
public class UserLocationDTO {
	private Long userId;
	private String username;
	private double lat;
	private double lng;
	private String place;
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public double getLat() {
		return lat;
	}
	public void setLat(double lat) {
		this.lat = lat;
	}
	public double getLng() {
		return lng;
	}
	public void setLng(double lng) {
		this.lng = lng;
	}
	public String getPlace() {
		return place;
	}
	public void setPlace(String place) {
		this.place = place;
	}
//This object now contains all the information we want to show to the end-user.
// Now, we'll need a way to map the User and Location objects into a single UserLocationDTO object.
// This is typically done via mapping tools, such as MapStruct or ModelMapper
}
