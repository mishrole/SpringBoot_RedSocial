package com.empresa.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.empresa.entity.Alumno;
import com.empresa.service.AlumnoService;

@Controller
public class AlumnoController {

	@Autowired
	private AlumnoService service;
	
	@RequestMapping("/verRegistraAlumno")
	public String verRegistra() {
		return "registraAlumno";
	}
	
	@RequestMapping("/verConsultaAlumnoNombre")
	public String verConsultaNombre() {
		return "consultaAlumnoPorNombre";
	}

	@RequestMapping("/verConsultaAlumnoDNI")
	public String verConsultaDNI() {
		return "consultaAlumnoPorDNI";
	}
	
	@RequestMapping("/verConsultaAlumnoNombreDNI")
	public String verConsultaNombreDNI() {
		return "consultaAlumnoPorNombreYDni";
	}
	
	@RequestMapping("/registraAlumno")
	@ResponseBody
	public Map<String, Object> registra(Alumno obj){
		Map<String, Object> salida = new HashMap<>();
		Alumno objSalida = service.insertaAlumno(obj);
		if (objSalida == null) {
			salida.put("MENSAJE", "Registro erróneo");
		}else {
			salida.put("MENSAJE", "Registro exitoso");
		}
		return salida;
	}
	
	@RequestMapping("/listaAlumnoPorNombre")
	@ResponseBody
	public List<Alumno> listaPorNombre(String filtro){
		return service.listaPorNombre(filtro);
	}	
	
	@RequestMapping("/listaAlumnoPorDni")
	@ResponseBody
	public List<Alumno> listaPorDni(String dni){
		return service.listaPorDni(dni);
	}
	
	@RequestMapping("/listaAlumnoPorNombreYDni")
	@ResponseBody
	public List<Alumno> listaAlumnoPorNombreYDni(String nombre, String dni) {
		return service.listaAlumnoPorNombreYDni(nombre, dni);
	}
}