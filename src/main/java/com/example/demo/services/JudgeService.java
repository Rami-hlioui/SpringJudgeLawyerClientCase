package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.JudgeDTO;
import com.example.demo.mappers.JudgeMapper;
import com.example.demo.models.Judge;
import com.example.demo.repositories.JudgeRepository;

import lombok.Data;


@Data
@Service
public class JudgeService {

	@Autowired
	private JudgeRepository JudgeRepo;
	
	public Judge createJudge(JudgeDTO judgeDTO) {
		Judge judge = JudgeMapper.INSTANCE.dtoToModel(judgeDTO);
		return JudgeRepo.save(judge);
	}
	
	public List<Judge> getAllJudges(){
		return JudgeRepo.findAll();
	}
	
	public JudgeDTO getJudgeById(long id) {
		Judge judge=JudgeRepo.findById(id).orElseGet(null);
		return JudgeMapper.INSTANCE.modelToDto(judge);
	}
	
	public void deleteJudge(long id) {
		JudgeRepo.deleteById(id);
	}
	
	public Judge updateJudge(JudgeDTO judgeDTO) {
		Judge judge = JudgeRepo.findById(judgeDTO.getId()).orElse(null);
		judge.setName(judge.getName());
		return JudgeRepo.save(judge);
	}
	
}
