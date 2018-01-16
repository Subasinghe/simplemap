package com.bpcbt.demo.mockdb;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.bpcbt.demo.entity.Location;

/**
 * This class is to create a mock database for demonstrating purpose. This
 * creates a list of location with actual data.
 * 
 * @author Sudharma Subasinghe
 *
 */
@Component
public class LocationDB {

	private List<Location> listLocation = new ArrayList<>();

	public LocationDB() {
		Location location1 = new Location(1, 6.909857, 79.852483, "WSO2 Lanka - my previous workplace");
		Location location2 = new Location(2, 6.796877, 79.9017781, "University of Moratuwa - university I studied");
		Location location3 = new Location(3, 6.3307447, 80.1679015, "Atuwagala Monastery - my favourite temple with beautiful nature");
		Location location4 = new Location(4, 6.27520137, 80.09749889, "My Home - This is my sweetest place");
		Location location5 = new Location(5, 6.2406305, 80.0547148, "G/Dharmasoka College, Ambalangoda - school I went");
		
		listLocation.add(location1);
		listLocation.add(location2);
		listLocation.add(location3);
		listLocation.add(location4);
		listLocation.add(location5);
	}

	/**
	 * This method returns the list of location with actual data.
	 * 
	 * @return list of {@Location}
	 */
	public List<Location> getLocationList() {
		return listLocation;
	}

}
