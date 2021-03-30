package com.empresa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.empresa.entity.Alumno;

// <Clase, PK> En nuestro caso el PK es entero, el ID del Alumno
public interface AlumnoRepository extends JpaRepository<Alumno, Integer>{

}
