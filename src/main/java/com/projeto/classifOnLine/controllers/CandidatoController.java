package com.projeto.classifOnLine.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.projeto.classifOnLine.model.Candidato;
import com.projeto.classifOnLine.repository.CandidatoRepository;

@Controller
public class CandidatoController {
	
	@Autowired
	private CandidatoRepository cr;
	
	@RequestMapping(value = "/cadastrarCandidato", method = RequestMethod.GET)
	public String form() {	
		return "candidato/formCandidato";
	}
	
	@RequestMapping(value = "/cadastrarCandidato", method = RequestMethod.POST)
	public String form(Candidato candidato) {
		cr.save(candidato);
		return "redirect:/cadastrarCandidato";
	}
	
	
	

}
