package net.java.springbootrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.java.springbootrestapi.entity.Billing;

@Repository
public interface BillingRepository extends JpaRepository<Billing, Long>{

}
