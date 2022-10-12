package com.example.demo.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.example.demo.dto.LawyerDTO;
import com.example.demo.models.Lawyer;

@Mapper
public interface LawyerMapper {
	
	LawyerMapper INSTANCE = Mappers.getMapper(LawyerMapper.class);
	
	 LawyerDTO modelToDTO(Lawyer lawyer);
	
	 Lawyer dtoToLawyer(LawyerDTO lawyerDTO);

}
