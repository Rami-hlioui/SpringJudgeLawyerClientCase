package com.example.demo.dto;



import com.example.demo.models.CaseStatus;
import com.example.demo.models.Client;
import com.example.demo.models.Judge;
import com.example.demo.models.Lawyer;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CaseDTO {

	private long id;
	 
	private String caseName;

	private CaseStatus status;

//	@JsonIgnore
//	private Judge judgeId;
//
//	@JsonIgnore
//	private Lawyer lawyerId;
//	
//	@JsonIgnore
//	private Client clientId;
	
	
}
