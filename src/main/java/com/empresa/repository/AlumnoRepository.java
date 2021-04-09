package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.empresa.entity.Alumno;

public interface AlumnoRepository  extends JpaRepository<Alumno, Integer>{

	@Query("select e from Alumno e where e.nombre like :param_filtro")
	public abstract List<Alumno> listaAlumno(@Param("param_filtro") String filtro);
	
	public abstract List<Alumno> findByDni(String dni);
	
	@Query("select e from Alumno e where e.nombre like :param_nombre and e.dni like :param_dni")
	public abstract List<Alumno> listaAlumnoPorNombreYDni(@Param("param_nombre") String nombre, @Param("param_dni") String dni);
	

	
}