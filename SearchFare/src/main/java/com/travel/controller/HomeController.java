package com.travel.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.travel.model.SearchFare;
import com.travel.service.FareService;

@Controller
public class HomeController {
	
	@Autowired
	FareService fareService;
	
	@RequestMapping(value="/home")
	public String home(@ModelAttribute("searchFare") SearchFare searchFare){
		//System.out.println("hi");
		return "welcome";
	}
	
	@RequestMapping(value="/search-fare")
	public String processSearchRequest(@ModelAttribute("searchFare") SearchFare searchFare, ModelMap model){
		
		//String fareResponse = fareService.getFareDetails(searchFare);
		searchFare = fareService.getFareDetails(searchFare);
	    //System.out.println(fareResponse.toString());
	    //model.addAttribute("fareResponse", fareResponse);
		model.addAttribute("searchFare", searchFare);
		return "search-fare";
	}
	
	


}
