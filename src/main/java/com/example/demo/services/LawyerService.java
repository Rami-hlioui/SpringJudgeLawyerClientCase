package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.LawyerDTO;
import com.example.demo.mappers.LawyerMapper;
import com.example.demo.models.Lawyer;
import com.example.demo.repositories.LawyerRepository;

import lombok.Data;

@Data 
@Service
public class LawyerService {
	
	@Autowired
	private LawyerRepository LawyerRepository;
	
	
	public Lawyer saveLawyer(LawyerDTO lawyerDTO) {
		Lawyer lawyer = LawyerMapper.INSTANCE.dtoToLawyer(lawyerDTO);
		return LawyerRepository.save(lawyer);
	}
	
	public List<Lawyer> getAllLawyers(){
		return LawyerRepository.findAll();
	}
	
	public Lawyer getLawyerById(long id) {
		return LawyerRepository.findById(id).orElse(null);
	}

	public void deleteLawyer(long id) {
		LawyerRepository.deleteById(id);
	}
	
	public Lawyer updateLawyer(Lawyer lawyer) {
		Lawyer existingLawyer = LawyerRepository.findById(lawyer.getId()).orElse(null);
		existingLawyer.setName(lawyer.getName());
		return LawyerRepository.save(existingLawyer);
	}
	
}
