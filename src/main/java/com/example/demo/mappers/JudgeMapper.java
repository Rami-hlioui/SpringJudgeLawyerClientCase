package com.example.demo.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.example.demo.dto.JudgeDTO;
import com.example.demo.models.Judge;

@Mapper
public interface JudgeMapper {
	
	JudgeMapper INSTANCE = Mappers.getMapper(JudgeMapper.class); 

	JudgeDTO modelToDto(Judge Judge) ;
	
	Judge dtoToModel(JudgeDTO JudgeDTO);
}
