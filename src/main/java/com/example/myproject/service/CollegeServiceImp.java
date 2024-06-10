package com.example.myproject.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.myproject.entity.College;
import com.example.myproject.entity.CollegeDto;
import com.example.myproject.repository.CollegeRepository;

@Service
public class CollegeServiceImp implements CollegeService{
	
	@Autowired
	CollegeRepository collegeRepo;

	@Override
	public CollegeDto postDto(CollegeDto post) {
		College college = new College();
		college.setId(post.getId());
		college.setName(post.getName());
		college.setPlace(post.getPlace());
		college.setContact(post.getContact());
		collegeRepo.save(college);
		return post;
	}

	@Override
	public CollegeDto getDto(int id) {
		
		Optional<College> entity=collegeRepo.findById(id);
		College college=entity.get();
		CollegeDto dto=new CollegeDto();
		dto.setId(college.getId());
		dto.setName(college.getName());
		dto.setPlace(college.getPlace());
		dto.setContact(college.getContact());	
	return dto;
	}

	@Override
	public CollegeDto update(CollegeDto dtoUpdate) {
		College entity= new College();
		entity.setId(dtoUpdate.getId());
		entity.setName(dtoUpdate.getName());
		entity.setPlace(dtoUpdate.getPlace());
		entity.setContact(dtoUpdate.getContact());
		collegeRepo.save(entity);
		return dtoUpdate;
	}

	@Override
	public String delete(int id) {
		collegeRepo.deleteById(id);
		return "delete completed";
	}

	@Override
	public List<CollegeDto> postAll(List<CollegeDto> dto) {

		List<College> entitylist = new ArrayList<>();

		for (CollegeDto dTo : dto) {
			College entity = new College();
			entity.setId(dTo.getId());
			entity.setName(dTo.getName());
			entity.setPlace(dTo.getPlace());
			entity.setContact(dTo.getContact());
			entitylist.add(entity);
			
		}
		
		List<College> saveCollege=collegeRepo.saveAll(entitylist);
		
		List<CollegeDto>dtoCollege = new ArrayList<>();
		
		for(College college:saveCollege) {
			
			CollegeDto resultDto = new CollegeDto();
			resultDto.setId(college.getId());
			resultDto.setName(college.getName());
			resultDto.setPlace(college.getPlace());
			resultDto.setContact(college.getContact());

			dtoCollege.add(resultDto);
		}
		return dtoCollege;
	}

	
	@Override
	public List<CollegeDto> getAll() {

		List<College> college = collegeRepo.findAll();

		List<CollegeDto> collegeDto = new ArrayList<>();

		for (College c : college) {
			CollegeDto allDto = new CollegeDto();
			allDto.setId(c.getId());
			allDto.setName(c.getName());
			allDto.setPlace(c.getPlace());
			allDto.setContact(c.getContact());

			collegeDto.add(allDto);
		}
		return collegeDto;
	}

}







