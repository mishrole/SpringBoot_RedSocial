package com.empresa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.empresa.entity.Concurso;
import com.empresa.service.ConcursoService;

@Controller
public class ConcursoController {
	
	@Autowired
	private ConcursoService service;
	
	@RequestMapping("/registroDeConcurso")
	public String registra(Concurso objConcurso) {
		service.insertaConcurso(objConcurso);
		return "registraConcurso";
	}
	
	@RequestMapping("/verConcurso")
	public String ver() {
		return "registraConcurso";
	}
}