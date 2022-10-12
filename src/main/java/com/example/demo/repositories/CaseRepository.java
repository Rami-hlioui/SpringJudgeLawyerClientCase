package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Case;

public interface CaseRepository extends JpaRepository<Case, Long>{

}
