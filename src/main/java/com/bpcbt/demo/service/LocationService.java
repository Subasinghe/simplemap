package com.bpcbt.demo.service;

import java.util.List;

import com.bpcbt.demo.entity.Location;

/**
 * This is the Service Interface which declares method to get list of locations.
 * 
 * @author Sudharma Subasinghe
 *
 */
public interface LocationService {
	
	public List<Location> getLocations();

}
