package com.empresa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.empresa.entity.Alumno;
import com.empresa.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService{

	@Autowired
	private AlumnoRepository repository;
	
	@Override
	public Alumno insertaAlumno(Alumno obj) {
		return repository.save(obj);
	}

	@Override
	public List<Alumno> listaPorNombre(String nom) {
		return repository.listaAlumno(nom+"%");
	}

	@Override
	public List<Alumno> listaPorDni(String dni) {
		return repository.findByDni(dni);
	}

	@Override
	public List<Alumno> listaAlumnoPorNombreYDni(String nombre, String dni) {
		return repository.listaAlumnoPorNombreYDni(nombre+"%", dni+"%");
	}


}