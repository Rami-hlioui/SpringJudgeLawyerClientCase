package com.example.demo.dto;

import java.util.List;

import com.example.demo.models.Case;
import com.example.demo.models.CaseStatus;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JudgeDTO {
	
	private long id;
	
	private String name;
	
	@JsonIgnore
	private List<Case> cases;



}
