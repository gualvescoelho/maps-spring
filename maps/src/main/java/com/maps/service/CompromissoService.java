package com.maps.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maps.models.Compromisso;
import com.maps.repository.CompromissoRepository;

@Service
public class CompromissoService {

	@Autowired
	private CompromissoRepository compromissoRepository;
	
	public Compromisso salvar(Compromisso parametro) {
		
		return compromissoRepository.save(parametro);
	}
	
	public List<Compromisso> pesquisar() {
		
		return compromissoRepository.findAll();
	}

	public Compromisso buscarPorNome(String nome) {
		
		return compromissoRepository.findByNome(nome);
	}
	
	public Compromisso alterar(Compromisso parametro) {
		
		return compromissoRepository.save(parametro);
	}
	
	public void removerCompromisso(Compromisso parametro) {
		
		compromissoRepository.delete(parametro);
	}
}
