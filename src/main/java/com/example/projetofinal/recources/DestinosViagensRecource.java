package com.example.projetofinal.recources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.projetofinal.domain.DestinosViagens;
import com.example.projetofinal.services.DestinosViagensService;

@RestController
@RequestMapping("/destinosviagens")
@CrossOrigin(origins = "*")
public class DestinosViagensRecource {
	
	@Autowired
	private DestinosViagensService destinosViagensService;
	
	@GetMapping
	public List<DestinosViagens> findAll(){
		return destinosViagensService.findAll();
	}
	
	@PostMapping("/cadastro")
	public DestinosViagens save(@RequestBody DestinosViagens obj) {
		return destinosViagensService.save(obj);
	}
	
	@PutMapping
	public DestinosViagens update(@RequestBody DestinosViagens obj) {
		return destinosViagensService.update(obj);
	}
	
	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable Long id) {
		destinosViagensService.deleteById(id);
	}
}
