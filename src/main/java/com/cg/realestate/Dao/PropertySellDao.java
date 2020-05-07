package com.cg.realestate.Dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.cg.realestate.model.PropertySell;

@Repository
public interface PropertySellDao extends CrudRepository<PropertySell, Integer> {
	

}
