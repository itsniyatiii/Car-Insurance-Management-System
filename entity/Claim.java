package com.springboot.carinsurance.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Claim_Details")
public class Claim 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int claim_id;
	private String claim_no;
	private double claim_amount;
	private String status;
	private Date issued_date;
	
	@ManyToOne
    @JoinColumn(name = "policy_id")
    private InsurancePolicy policy;
	
	
	
	
}
