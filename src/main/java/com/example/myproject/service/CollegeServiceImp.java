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

	//POST Method
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

	//GET Method
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

	//UPDATE Method
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

	//DELETE Method
	@Override
	public String delete(int id) {
		collegeRepo.deleteById(id);
		return "delete completed";
	}
	
	/******************************CURD ALL METHODS********************************************/

	// POSTALL Method
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
		 collegeRepo.saveAll(entitylist);
		 return dto;
	}
	
	// GET ALL
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

	@Override
	public List<CollegeDto> getBy(String name) {
		List<College> college;
		if (name == null) {
			college = collegeRepo.findAll();
		} else {
			college = collegeRepo.findByName();
		}
		List<CollegeDto> collegdto = new ArrayList<>();
		for (College ent : college) {
			CollegeDto dto = new CollegeDto();
			dto.setId(ent.getId());
			dto.setName(ent.getName());
			dto.setPlace(ent.getPlace());
			dto.setContact(ent.getContact());
			collegdto.add(dto);
		}
		return collegdto;
	}
	
	

	
	

	

	
	
	
	
	
	
	
}


