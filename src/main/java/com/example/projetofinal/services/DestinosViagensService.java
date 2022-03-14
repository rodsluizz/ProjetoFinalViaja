package com.example.projetofinal.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.projetofinal.domain.DestinosViagens;

import com.example.projetofinal.repositories.DestinosViagensRepository;

@Service
public class DestinosViagensService {
	

	@Autowired
	private DestinosViagensRepository destinosViagensRepository;
	
	public DestinosViagens save(DestinosViagens obj) {
		return destinosViagensRepository.save(obj);
	}
	
	public List<DestinosViagens> findAll(){
		return destinosViagensRepository.findAll();
	}
	
	public DestinosViagens update(DestinosViagens obj) {
		return destinosViagensRepository.save(obj);
	}
	
	public void deleteById(Long id) {
		destinosViagensRepository.deleteById(id);
	}


}
