package net.java.springbootrestapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.java.springbootrestapi.entity.Payroll;
import net.java.springbootrestapi.service.HrService;

@RestController
@RequestMapping("/HR")
public class HrController {
	
	public HrService hrService;
	
	@Autowired
	public HrController(HrService hrService)
	{
		this.hrService = hrService;
	}

	@PostMapping("/payrollHr")
	public ResponseEntity<Payroll> createPayroll(@RequestBody Payroll payroll)
	{
		Payroll p = hrService.createPayroll(payroll);
		return ResponseEntity.status(HttpStatus.CREATED).body(p);
	}
	
	@GetMapping("/payrollGet")
	public ResponseEntity<List<Payroll>> getAllPayrolls()
	{
		List<Payroll> allpay = hrService.getAllPayrolls();
		return ResponseEntity.ok(allpay);
	}
}
