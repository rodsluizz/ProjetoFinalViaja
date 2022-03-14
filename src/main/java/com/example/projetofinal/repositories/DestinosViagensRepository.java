package com.example.projetofinal.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.projetofinal.domain.DestinosViagens;



@Repository
public interface DestinosViagensRepository extends JpaRepository<DestinosViagens, Long>{
	
}
