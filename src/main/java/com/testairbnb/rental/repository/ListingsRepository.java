package com.testairbnb.rental.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.testairbnb.rental.domain.Listing;

public interface ListingsRepository extends MongoRepository<Listing, String> {
	List<Listing> findByPropertyType(String name);
	List<Listing> findByName(String name);
}