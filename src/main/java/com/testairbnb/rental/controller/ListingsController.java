package com.testairbnb.rental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.testairbnb.rental.domain.Listing;
import com.testairbnb.rental.repository.ListingsRepository;

@RestController
public class ListingsController {
	
	@Autowired
	private ListingsRepository repository;
	
	@CrossOrigin(origins = "http://localhost:3000")
	@RequestMapping(value = "/listings", method = RequestMethod.GET)
	public List<Listing> getAllListings() {
		System.out.println("Retrieving listings......");
		return repository.findAll();
	}
	
	@RequestMapping(value = "/listings/propertytype/{property_type}", method = RequestMethod.GET)
	public List<Listing> getAllListingsByPropertyType(@PathVariable("property_type") String property_type) {
		System.out.println("Retrieving listings by property type.......");
		return repository.findByPropertyType(property_type);
	}

}