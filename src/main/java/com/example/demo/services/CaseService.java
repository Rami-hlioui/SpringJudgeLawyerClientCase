package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.CaseDTO;
import com.example.demo.mappers.CaseMapper;
import com.example.demo.models.Case;
import com.example.demo.repositories.CaseRepository;

import lombok.Data;


@Data
@Service
public class CaseService {

	@Autowired
	private CaseRepository CaseRepo;
		
	public Case createCase(CaseDTO CaseDTO) {
		Case Tcase = CaseMapper.INSTANCE.dtoToModel(null);
		return CaseRepo.save(Tcase);
	}
	
	public List<Case> getAllCases(){
		return CaseRepo.findAll();
	}
	
	public CaseDTO getCaseById(long id) {
		Case Tcase= CaseRepo.findById(id).orElse(null);
		return CaseMapper.INSTANCE.modelToDto(Tcase) ;
	}
	
	public String deleteCaseById(long id ) {
		CaseRepo.deleteById(id);
		return "Case deleted!!!";
	}
	
	public Case updateCase(CaseDTO caseDTO) {
		Case TempCase = CaseRepo.findById(caseDTO.getId()).orElse(null);
		TempCase.setName(caseDTO.getCaseName());
		TempCase.setStatus(caseDTO.getStatus());
		return CaseRepo.save(TempCase);
	}
}
