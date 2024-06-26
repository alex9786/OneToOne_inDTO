package com.example.myproject.entity;

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

@Table(name="deportmentDetails")
public class Deportments {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	private int no;
	
	private String name;
	
	private int placements;
	
	
	
}
