package com.bpcbt.demo.entity;

/**
 * This is the Location entity class which represents all the necessary fields
 * for a Location entity.
 * 
 * @author Sudharma Subasinghe
 *
 */
public class Location {

	// Id of the location
	private int id;

	// Latitude of the location
	private double latitude;

	// Longitude of the location
	private double longitude;

	// Description for the location
	private String hint;

	public Location() {
	}

	public Location(int id, double latitude, double longitude, String hint) {
		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;
		this.hint = hint;
	}

	// getter and setter methods
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getLatitude() {
		return latitude;
	}

	public void setLatitude(double latitude) {
		this.latitude = latitude;
	}

	public double getLongitude() {
		return longitude;
	}

	public void setLongitude(double longitude) {
		this.longitude = longitude;
	}

	public String getHint() {
		return hint;
	}

	public void setHint(String hint) {
		this.hint = hint;
	}

	@Override
	public String toString() {
		return "Location [id=" + id + ", latitude=" + latitude + ", longitude=" + longitude + ", hint=" + hint + "]";
	}
}
