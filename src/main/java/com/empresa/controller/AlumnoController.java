package com.empresa.controller;

import javax.servlet.http.HttpSession;

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
	public String registra(Alumno objAlumno, HttpSession session) {
		Alumno objSalida = service.insertaAlumno(objAlumno);

		if(objSalida == null) {
			session.setAttribute("MENSAJE", "Registro erróneo");
		}else {
			session.setAttribute("MENSAJE", "Registro exitoso");
		}

		return "redirect:verAlumno";
	}
	
	@RequestMapping("/verAlumno")
	public String ver() {
		return "registraAlumno";
	}

}
