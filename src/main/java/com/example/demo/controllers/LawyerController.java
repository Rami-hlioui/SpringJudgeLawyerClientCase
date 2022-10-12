package com.example.demo.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.LawyerDTO;
import com.example.demo.models.Lawyer;
import com.example.demo.services.LawyerService;

@RestController
@RequestMapping("/lawyer")
public class LawyerController {

	@Autowired
	private LawyerService LawyerService;
	
	@PostMapping
	public Lawyer createLawyer(@RequestBody LawyerDTO lawyerDTO) {
		return LawyerService.saveLawyer(lawyerDTO);
	}
	
	@GetMapping("/all")
	public List<Lawyer>  getAllLawyers(){
		return LawyerService.getAllLawyers();
	}
	
	@GetMapping("/{id}")
	public Lawyer getLawyerById(@PathVariable long id) {
		return LawyerService.getLawyerById(id);
	}
	
	@DeleteMapping("/{id}")
	public void deleteLawyerById(@PathVariable long id) {
		LawyerService.deleteLawyer(id);
	}
	
	
}
