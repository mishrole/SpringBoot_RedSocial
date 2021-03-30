package com.empresa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Alumno;
import com.empresa.repository.AlumnoRepository;

// Capa de Servicio = Capa de Negocio

@Service
public class AlumnoServiceImplement implements AlumnoService {
	
	// Trabajo directamente con el padre, la interfaz
	@Autowired // Instancia el objeto de la clase automáticamente
	private AlumnoRepository repository;
	
	@Override
	public Alumno insertaAlumno(Alumno objAlumno) {
		// Heredado de la plantilla
		return repository.save(objAlumno);
	}

}
