package com.maps.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.maps.models.Compromisso;

public interface CompromissoRepository extends JpaRepository<Compromisso, Long>{

	Compromisso findByNome(String name);
	
}
