package com.bpcbt.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bpcbt.demo.dao.LocationDAO;
import com.bpcbt.demo.entity.Location;

/**
 * This is the Service implementation to get list of locations.
 * 
 * @author Sudharma Subasinghe
 *
 */
@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationDAO locationDAO;

	/**
	 * This method calls DAO layer to get list of locations.
	 */
	@Override
	public List<Location> getLocations() {
		return locationDAO.getLocations();
	}

}
