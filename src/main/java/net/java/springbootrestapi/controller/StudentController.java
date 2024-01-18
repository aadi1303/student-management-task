package net.java.springbootrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import net.java.springbootrestapi.model.Student;
import net.java.springbootrestapi.repository.StudentRepository;

@Controller
@ResponseBody
@RequestMapping
public class StudentController {
	
	@Autowired
	private StudentRepository studentRepository;

	
	//http://localhost:8080/student
    @GetMapping("/student")
    public Student getStudent() {
        Student student = new Student( "Aadinath", "Nawle");
        
        return student;
    }
    
    
    @GetMapping("/student/bynames")
    public List<Student> getStudents() {
    	
    	List<Student> students = studentRepository.findByFirstNameIn(List.of("Aadinath", "Somesh"));
    	return students;
	}
    
    
    // Spring boot REST API that handles HTTP POST Request
    //http://localhost:8080/student/add
    @PostMapping("/student/add")
    public Student addStudent(@RequestBody Student student)
    {
    	return studentRepository.save(student);
    }
    
    
    // Spring boot REST API that handles HTTP PUT Request
    @PutMapping("/student/{id}/update")
    public Student updateStudent(@RequestBody Student student,@PathVariable("id") int studentId) {
    	System.out.println(student.getFirstName());
    	
    	System.out.println(student.getLastName());
    	
    	return student;
    }
    
    // Spring boot REST API that handles HTTP DELETE Request
    @DeleteMapping("student/{id}/delete")
    public String  deleteStudent(@PathVariable("id") int studentId) {
    	System.out.println(studentId);
    	return "Student deleted Successfully !!!!";
    }
    
    
}
