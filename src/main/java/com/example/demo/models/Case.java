package com.example.demo.models;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="case")
@Data @AllArgsConstructor @NoArgsConstructor
public class Case {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="case_id")
	private long id;
	 
	@Column(name="caseName")
	private String caseName;
	
	@Column(name="status")
	private CaseStatus status;
	
//	
//	@ManyToOne
//	@JoinColumn(name="lawyer_id")
//	private Lawyer lawyerID;
//	
//	@ManyToOne
//	@JoinColumn(name="client_id",nullable=false)
//	@JsonIgnore
//	private Client clientId;
	
	
}
