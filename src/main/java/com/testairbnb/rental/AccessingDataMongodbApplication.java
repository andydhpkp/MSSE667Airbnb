package com.testairbnb.rental;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.testairbnb.rental.domain.Listing;
import com.testairbnb.rental.repository.ListingsRepository;

@SpringBootApplication
public class AccessingDataMongodbApplication implements CommandLineRunner {

	@Autowired
	private ListingsRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(AccessingDataMongodbApplication.class, args);
	}
	
	@Override
	public void run(String... args) throws Exception {
		
		try {
			
			System.out.println("Find By Name:");
			System.out.println("-------------------");
			System.out.println(repository.findByName("Horto flat with small garden"));
			
			System.out.println("Find by ID:");
			System.out.println(repository.findById("10009999"));
			Optional<Listing> listingOpt = repository.findById("10009999");
			
			Listing listing = listingOpt.get();
			System.out.println(listing);
		} catch (Exception e) {
			System.out.println("Listing did not work");
			System.out.println(e);
			System.out.println("getCause = " + e.getCause());
		}
		
	}
}