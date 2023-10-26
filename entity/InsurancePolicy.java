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
@Table(name="InsurancePolicy_Details")
public class InsurancePolicy
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int policy_id;
	private String policy_no;
	private String policy_type;
	private Date start_date;
	private Date end_date;
	private double premium_amount;
	private double coverage_amount;
	private double deductible_amount;
	
	@ManyToOne
    @JoinColumn(name = "policyholder_id")
    private User user;
	
	

}
