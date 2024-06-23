package net.java.springbootrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import net.java.springbootrestapi.entity.Payroll;

@Repository
public interface PayrollRepository extends JpaRepository<Payroll, Long>{

}
