package com.example.demo.dto;



import com.example.demo.models.CaseStatus;
import com.example.demo.models.Client;
import com.example.demo.models.Judge;
import com.example.demo.models.Lawyer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CaseDTO {

	private long id;
	 
	private String caseName;

	private CaseStatus status;

	private Judge judgeId;

	private Lawyer lawyerId;
	
	private Client clientId;
}
