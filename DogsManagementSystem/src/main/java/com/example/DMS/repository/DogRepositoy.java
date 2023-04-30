package com.example.DMS.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.DMS.Models.Dog;


/**
 * 
 * @author S555230 Anaparthi Sai Ganesh
 *
 */
public interface DogRepositoy extends CrudRepository<Dog,Integer> {

	List<Dog> findByName(String name);
	
}
