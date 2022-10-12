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

import com.example.demo.dto.JudgeDTO;
import com.example.demo.models.Judge;
import com.example.demo.services.JudgeService;

@RestController
@RequestMapping("/judge")
public class JudgeController {

	@Autowired
	private JudgeService JudgeService;
	
	@PostMapping
	public Judge createJudge(@RequestBody JudgeDTO judgeDTO) {
		return JudgeService.createJudge(judgeDTO);
	}
	
	@GetMapping("/{id}")
	public JudgeDTO getJudgeById(@PathVariable long id) {
		return JudgeService.getJudgeById(id);
	}
	
	@GetMapping("/all")
	public List<Judge> getAllJudges(){
		return JudgeService.getAllJudges();
	}
	
	@PutMapping("/put")
	public Judge updateJudgeById(@RequestBody JudgeDTO judgeDTO) {
		return JudgeService.updateJudge(judgeDTO);
	}
	
	@DeleteMapping("/{id}")
	public void deleteJudgeByid(@PathVariable long id) {
		 JudgeService.deleteJudge(id);
	}
}
