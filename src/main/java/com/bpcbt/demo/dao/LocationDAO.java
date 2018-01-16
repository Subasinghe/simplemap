package com.bpcbt.demo.dao;

import java.util.List;

import com.bpcbt.demo.entity.Location;

/**
 * This is the Data Access Object(DAO) Interface which declares method to get list of locations.
 * 
 * @author Sudharma Subasinghe
 *
 */
public interface LocationDAO {
	
	public List<Location> getLocations();

}
