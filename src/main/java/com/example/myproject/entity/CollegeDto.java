package com.example.myproject.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class CollegeDto {

	private int id;
	
	private String name;
	
	private String place;
	
	private long contact;
	
	
	
}
