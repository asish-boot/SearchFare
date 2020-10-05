package com.travel.service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.travel.model.SearchFare;

@Service
public class FareService {
	
	public SearchFare getFareDetails(SearchFare searchFare){
		String response = "";
		final String uri = "http://localhost:8081/trip/fare/"+searchFare.getSource()+"/"+searchFare.getDestination();
	    RestTemplate restTemplate = new RestTemplate();
	    
	    response = restTemplate.getForObject(uri, String.class);
	    //System.out.println(response.toString());
	    if(!response.equalsIgnoreCase("") && response != null){
	    	String[] val = response.split(",");
		    String[] colVal1 = val[0].split(":");
		    String[] colVal2 = val[1].split(":");
		    String[] colVal3 = val[2].split(":");
		    String[] colVal4 = val[3].split(":");
		    searchFare.setAmount(colVal1[1].toString());
		    searchFare.setCurrency(colVal2[1].toString());
		    searchFare.setSource(colVal3[1].toString());
		    searchFare.setDestination(colVal4[1].toString().replace("}", ""));
		    searchFare.setMessage("");
	    }else{
	    	searchFare.setMessage("No Fare Found !!!");
	    }
	    
		return searchFare;
	}

}
