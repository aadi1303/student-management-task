package net.java.springbootrestapi.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import net.java.springbootrestapi.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long> {

    List<Student> findByFirstNameIn(List<String> firstNames);
}
