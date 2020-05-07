package com.cg.realestate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cg.realestate.model.PropertySell;
import com.cg.realestate.service.PropertySellService;
import com.netflix.discovery.converters.Auto;

@RestController
public class PropertySellController {

	@Autowired
	PropertySellService service;
	
	@PostMapping(path = "/add")
	public PropertySell add( @RequestBody PropertySell propertySell) {
		return service.addData(propertySell);
	}
	
	@GetMapping( path = "/display")
	public List<PropertySell> display( ){
		return service.display();
	}
	
	
	
}
