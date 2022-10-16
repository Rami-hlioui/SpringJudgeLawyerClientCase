package com.example.demo.dto;


import java.util.List;

import com.example.demo.models.Case;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LawyerDTO {

	private long id;
	
	private String name;

	@JsonIgnore
	private List<Case> cases;

}
