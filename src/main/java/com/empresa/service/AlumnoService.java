package com.empresa.service;

import com.empresa.entity.Alumno;

public interface AlumnoService {
	
	// Todos los metodos de la interface son abstract por defecto
	// La interface solo admite  metodos abstractos
	// Es como una clase sin vida para poder implementarla
	// Spring trabaja todo con interface, para que el codigo trabaje con el padre y no con los hijos
	
	// Al trabajar con la interface, puedes trabajar con multiples hijos
	// Hace mas sencilla la respuesta al cambio
	// Cambias el service hijo en vez de cambiar todos los controllers
	
	// Service = Padre		 ServiceImplement = Hijo
	
	public abstract Alumno insertaAlumno(Alumno objAlumno);
}
