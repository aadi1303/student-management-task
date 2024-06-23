package net.java.springbootrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.java.springbootrestapi.entity.Customer;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>{

	

}
