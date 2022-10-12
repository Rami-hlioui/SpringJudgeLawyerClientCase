package com.example.demo.mappers;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;
import com.example.demo.dto.ClientDTO;
import com.example.demo.models.Client;

@Mapper
public interface ClientMapper {
	
	ClientMapper INSTANCE=Mappers.getMapper(ClientMapper.class);

	ClientDTO modelToDto(Client Client);
	
	Client dtoToModel(ClientDTO ClientDTO); 
	
}
