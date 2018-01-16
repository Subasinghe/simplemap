package com.bpcbt.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bpcbt.demo.entity.Location;
import com.bpcbt.demo.service.LocationService;

/**
 * This is the controller class which handles map functionality of the web application.
 * 
 * @author Sudharma Subasinghe
 */
@Controller
@RequestMapping("/map")
public class MapController {

	@Autowired
	private LocationService locationService;

	@GetMapping("/about")
	public String showDescription() {
		return "about";
	}

	@GetMapping("/showMap")
	public String showFavLocations(Model theModel) {
		List<Location> locationList = locationService.getLocations();
		theModel.addAttribute("listLoc", locationList);
		return "map-view";
	}

}
