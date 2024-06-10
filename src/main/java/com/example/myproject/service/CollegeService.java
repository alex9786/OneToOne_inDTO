package com.example.myproject.service;

import java.util.List;

import com.example.myproject.entity.CollegeDto;

public interface CollegeService {

	CollegeDto postDto(CollegeDto post);

	CollegeDto getDto(int id);

	CollegeDto update(CollegeDto dtoUpdate);

	String delete(int id);

	List<CollegeDto> postAll(List<CollegeDto> dto);

	List<CollegeDto> getAll();

}
