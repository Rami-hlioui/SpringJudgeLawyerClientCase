package com.example.demo.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.models.Lawyer;

public interface LawyerRepository extends JpaRepository<Lawyer,Long> {

}
