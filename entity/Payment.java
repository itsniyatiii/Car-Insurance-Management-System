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
@Table(name="Payment_Details")
public class Payment
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int payment_id;
	private double payment_amount;
	private Date payment_date;
	
	@ManyToOne
    @JoinColumn(name = "policy_id")
    private InsurancePolicy policy;
	
}
