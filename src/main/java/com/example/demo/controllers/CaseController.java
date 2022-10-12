package com.example.demo.controllers;

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

import com.example.demo.dto.CaseDTO;
import com.example.demo.models.Case;
import com.example.demo.services.CaseService;

@RestController
@RequestMapping("/case")
public class CaseController {

	@Autowired
	private CaseService CaseService;
	
	@PostMapping
	public Case createCase(@RequestBody CaseDTO CaseDTO) {
		return CaseService.createCase(CaseDTO);
	}
	
	@GetMapping("/all")
	public List<Case> getAllCases(){
		return CaseService.getAllCases();
	}
	
	@GetMapping("/{id}")
	public CaseDTO getCaseById(@PathVariable long id) {
		return CaseService.getCaseById(id);
	}
	
	@DeleteMapping("/{id}")
	public String deleteCaseById(@PathVariable long id) {
		return CaseService.deleteCaseById(id);
	}
	
	@PutMapping
	public Case updateCase(@PathVariable CaseDTO CaseDTO) {
		return CaseService.updateCase(CaseDTO);
	}
	
}
