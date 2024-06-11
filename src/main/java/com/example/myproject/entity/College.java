package com.example.myproject.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

@Table(name="collegeDetails")
public class College {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="collegeNo")
	private int id;
	
	@Column(name="collegeName")
	private String name;
	
	@Column(name="location")
	private String place;
	
	private long contact;
	

//	@OneToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name="fkId")
//	private Deportments deportments;
//	
}
