package com.example.myproject.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.myproject.entity.CollegeDto;
import com.example.myproject.service.CollegeService;

@RestController
@RequestMapping("/rest")
public class CollegeController {
	
	@Autowired
	CollegeService service;
	
	@PostMapping("/post")
	public CollegeDto postDto(@RequestBody CollegeDto post) {
		return service.postDto(post);
	}
	
	@GetMapping("/get/{id}")
	public CollegeDto getdto(@PathVariable ("id") int id) {
		return service.getDto(id);
	}
	
	@PutMapping("/update")
	
	public CollegeDto update(@RequestBody CollegeDto dtoUpdate) {
		return service.update(dtoUpdate);
	}
	
	@DeleteMapping("/delete")
	public String delete(@PathVariable int id) {
		return service.delete(id);
	}
	
	@PostMapping("/create")
	public List<CollegeDto> postAll(@RequestBody List<CollegeDto> dto){
		return service.postAll(dto);
	}
	
	@GetMapping("/getAll")
	public List<CollegeDto> getAll(){
		return service.getAll();
	}
	
	

}
