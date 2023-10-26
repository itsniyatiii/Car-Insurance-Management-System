package com.springboot.carinsurance.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="Car_Details")
public class Car
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int car_id;
	private String VIN;
	private String car_make;
	private String car_model;
	private String car_manufacturing_year;
	private String car_registration_no;
	
	@OneToOne
	@JoinColumn(name = "policy_id")
	private InsurancePolicy policy;
	
	

	
}
