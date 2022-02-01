package com.testairbnb.rental.domain;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document (collection = "Airbnb")
public class Listing {
	@Id private String id;
	
		private String listing_url;
		private String name;
		@Field("property_type")
		private String propertyType;
		private String summary;
		private String description;
		
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getSummary() {
		return summary;
	}
	
	public String setSummary(String summary) {
		return summary;
	}
	
	public String getListing() {
		return listing_url;
	}
	
	public String setListing(String listing_url) {
		return listing_url;
	}
	
	public String getName() {
		return name;
	}
	
	public String setName(String name) {
		return name;
	}

}
