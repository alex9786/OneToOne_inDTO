package com.example.myproject.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.myproject.entity.College;
import com.example.myproject.entity.CollegeDto;

@Repository
public interface CollegeRepository extends JpaRepository<College, Integer> {


	List<College> findByName();

}
