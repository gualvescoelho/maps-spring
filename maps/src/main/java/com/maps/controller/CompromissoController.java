package com.maps.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.maps.models.Compromisso;
import com.maps.service.CompromissoService;

@RestController
@RequestMapping(value="/compromissos")
public class CompromissoController {
	
	@Autowired
	CompromissoService compromissoService;
	
	@GetMapping("/compromissos")
	public List<Compromisso> listaCompromissos(){
		
		return compromissoService.pesquisar();
	}
	
	@GetMapping("/compromisso/{nome}")
	public Compromisso listaCompromissosByNome(@PathVariable(value="nome") String nome){
		
		return compromissoService.buscarPorNome(nome);
	}
	
	@PostMapping("/compromisso")
	public Compromisso listaCompromissosByNome(@RequestBody Compromisso compromisso){
		
		return compromissoService.salvar(compromisso);
	}
	
	@DeleteMapping("/compromisso")
	public void removerCompromisso(@RequestBody Compromisso compromisso){
		
		compromissoService.removerCompromisso(compromisso);
	}
	
	@PutMapping("/compromisso")
	public void alterarCompromisso(@RequestBody Compromisso compromisso){
		
		compromissoService.alterar(compromisso);
	}
	
}
