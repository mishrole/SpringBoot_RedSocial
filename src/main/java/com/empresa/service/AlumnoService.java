package com.empresa.service;

import java.util.List;

import com.empresa.entity.Alumno;

public interface AlumnoService {

	public abstract Alumno insertaAlumno(Alumno obj);
	public abstract List<Alumno> listaPorNombre(String nom);
	public abstract List<Alumno> listaPorDni(String dni);
	public abstract List<Alumno> listaAlumnoPorNombreYDni(String nombre, String dni);
	
}
