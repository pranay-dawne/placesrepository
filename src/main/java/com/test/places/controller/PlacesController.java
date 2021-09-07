package com.test.places.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.test.places.model.Places;
import com.test.places.repository.PlacesRepository;

@RestController

public class PlacesController {

	@Autowired
	private PlacesRepository placesRepository;

	@GetMapping("/findplaces")
	public List<Places> getAllPlaces() {
		return (List<Places>) placesRepository.findAll();
	}

	@PostMapping("/saveplace")
	public List<Places> saveNewPlaces(@RequestBody Places newPlace) {
		placesRepository.save(newPlace);
		return (List<Places>) placesRepository.findAll();
	}

	@GetMapping("/findplaces/{id}")
	public Optional<Places> getPlaceById(@PathVariable String id) {
		return placesRepository.findById(id);
	}
	
//	public void updatePlaces(@RequestBody Places updatePlace, @PathVariable String id) {
//		placesRepository.saveAll(id, updatePlace);
//	}

}
