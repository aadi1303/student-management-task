package net.java.springbootrestapi.entity;
import java.util.Date;

import jakarta.persistence.Entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
public class Billing {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	    private Date billingDate; 
		private Double amount; 
	    private String status; 
	    private String description; 
	    public Long getCustomerId() {
			return id;
		}
		public Date getBillingDate() {
			return billingDate;
		}

		public void setBillingDate(Date billingDate) {
			this.billingDate = billingDate;
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

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public void setId(Long id) {
			this.id = id;
		}


}
