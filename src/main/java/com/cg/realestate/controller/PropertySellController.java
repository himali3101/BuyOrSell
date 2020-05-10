package com.cg.realestate.controller;

import java.util.Date;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.realestate.model.Property;
import com.cg.realestate.model.PropertySell;
import com.cg.realestate.service.PropertySellService;
import com.netflix.discovery.converters.Auto;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/buyorsell")
@Api(value = "Property buy or sell  Management")
public class PropertySellController {

	private static final Logger logger = LoggerFactory.getLogger(PropertySellController.class);
	
	@Autowired
	PropertySellService service;
	
	@PostMapping(path = "/add")
	@ApiOperation(value = "addSoldProperty", nickname = "addSoldProperty")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = PropertySell.class),
							@ApiResponse(code = 500, message = "Failure", response = PropertySell.class) })
	public PropertySell add( @RequestBody PropertySell propertySell) {
		logger.info("Adding sold Property .");
		logger.trace(" Inside property sold add() function");
		logger.error("Error happened at add() of buyorsell");
		Date date = new Date();
		propertySell.setDate(date);
		return service.addData(propertySell);
	}
	
	@GetMapping( path = "/display")
	@ApiOperation(value = "displaySoldProperty", nickname = "displaySoldProperty")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Success", response = PropertySell.class),
							@ApiResponse(code = 500, message = "Failure", response = PropertySell.class) })
	public List<PropertySell> display( ){
		logger.info("display sold properties.");
		logger.trace(" Inside display() function of sold properties");
		logger.error("Error happened at display() of buyorsell");
		return service.display();
	}
	
	
	
}
