package net.java.springbootrestapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.java.springbootrestapi.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
