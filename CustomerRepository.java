package com.charter.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.charter.entity.*;

public interface CustomerRepository extends JpaRepository<Customer,Long>{

	//CustomerRepository interface is used for communicating the application with database
	
	@Query("Select * from Customer where date > NOW() - INTERVAL 3 MONTH ")
	List<Customer> findAll();
}
