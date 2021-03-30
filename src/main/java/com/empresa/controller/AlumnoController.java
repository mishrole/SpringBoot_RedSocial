package com.empresa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.empresa.entity.Alumno;
import com.empresa.service.AlumnoService;

@Controller
public class AlumnoController {
	
	@Autowired
	private AlumnoService service;
	
	@RequestMapping("/registroDeAlumno")
	public String registra(Alumno objAlumno) {
		service.insertaAlumno(objAlumno);
		return "registraAlumno";
	}
	
	@RequestMapping("/verAlumno")
	public String ver() {
		return "registraAlumno";
	}

}
