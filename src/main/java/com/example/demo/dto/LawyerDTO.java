package com.example.demo.dto;

import java.util.List;

import com.example.demo.models.Case;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;

@Data
public class LawyerDTO {

	private long id;
	
	private String name;


}
