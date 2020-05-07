package com.cg.realestate.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.realestate.Dao.PropertySellDao;
import com.cg.realestate.model.Property;
import com.cg.realestate.model.PropertySell;

@Service
public class PropertySellService {

	@Autowired
	PropertySellDao dao;
	
	public PropertySell addData( PropertySell propertySell) {
		return dao.save(propertySell);
	}
	
	public List<PropertySell> display(){
		List<PropertySell> properties = new ArrayList<>();
		dao.findAll().forEach(properties::add);
		return properties;
	}
	
}
