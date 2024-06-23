package net.java.springbootrestapi.entity;

import java.util.Date;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Payroll 
{

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	
	   private Long userId; 
	    private Date payDate;
	    private Double amount; 
	    private String status; 
	    private String payPeriod;
		public Long getId() {
			return id;
		}

		public Long getUserId() {
			return userId;
		}
		public void setUserId(Long userId) {
			this.userId = userId;
		}
		public Date getPayDate() {
			return payDate;
		}
		public void setPayDate(Date payDate) {
			this.payDate = payDate;
		}
		public Double getAmount() {
			return amount;
		}
		public void setAmount(Double amount) {
			this.amount = amount;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		public String getPayPeriod() {
			return payPeriod;
		}
		public void setPayPeriod(String payPeriod) {
			this.payPeriod = payPeriod;
		} 

	
}
