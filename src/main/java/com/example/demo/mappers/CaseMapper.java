package com.example.demo.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.demo.dto.CaseDTO;
import com.example.demo.models.Case;

@Mapper
public interface CaseMapper {
	
	CaseMapper INSTANCE = Mappers.getMapper(CaseMapper.class);
	
	Case dtoToModel(CaseDTO caseDTO);
	
	CaseDTO modelToDto(Case caseInput);

}
