package com.grupo5.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.grupo5.api.model.SalaCafeModel;


@Repository
public interface SalaCafeRepository extends JpaRepository<SalaCafeModel, Long>{

	
}
