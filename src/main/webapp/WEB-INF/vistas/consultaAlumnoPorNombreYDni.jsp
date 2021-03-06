<!DOCTYPE html>
<html lang="es" >
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/jquery.dataTables.min.js"></script>
<script type="text/javascript" src="js/dataTables.bootstrap.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/bootstrapValidator.js"></script>
<link rel="stylesheet" href="css/bootstrap.css"/>
<link rel="stylesheet" href="css/dataTables.bootstrap.min.css"/>
<link rel="stylesheet" href="css/bootstrapValidator.css"/>
<title>Ejemplos de CIBERTEC - Jorge Jacinto </title>
</head>
<body> 
 <div class="container">
 <h2>Consulta de alumno por Nombre y Dni</h2>
		 <div class="col-md-23" >  
				
		       <form action="filtraAlumno" accept-charset="UTF-8"  class="simple_form" id="defaultForm2"  method="post">
					<div class="row">
						<div class="col-md-3">
							<input class="form-control" id="id_nombre" name="nombre" placeholder="Ingrese el nombre" type="text"/>
						</div>
						<div class="col-md-3">
							<input class="form-control" id="id_dni" name="dni" placeholder="Ingrese el dni" type="text"/>
						</div>
						<div class="col-md-3">	
							<button type="button" class="btn btn-primary" id="id_filtro" >FILTRA</button><br>&nbsp;<br>
						</div>
					</div>			
				</form>	
				
					<div class="row" > 
						<div class="col-md-12">
								<div class="content" >
						
									<table id="id_table" class="table table-striped table-bordered" >
										<thead>
											<tr>
												<th>ID</th>
												<th>Nombre</th>
												<th>DNI</th>
												<th>Correo</th>
												<th>Fecha Nacimiento</th>
											</tr>
										</thead>
										<tbody>
										</tbody>
										</table>	
									
								</div>	
						</div>
					</div>
		 	
		  </div>
</div>

<script type="text/javascript">

$("#id_filtro").click(function (){
	const nombre = $("#id_nombre").val();
	const dni = $("#id_dni").val();
	
	if(nombre.length > 0 && dni.length > 0) {
		$.getJSON('listaAlumnoPorNombreYDni', {'nombre':nombre, 'dni':dni}, function(data){
			agregarGrilla(data);
		});
	} else if (nombre.length > 0 && !(dni.length > 0)) {
		$.getJSON('listaAlumnoPorNombre', {'filtro':nombre}, function(data){
			agregarGrilla(data);
		});
	} else {
		$.getJSON("listaAlumnoPorDni",{'dni':dni}, function(data){
			agregarGrilla(data);
		});
	}
});

function agregarGrilla(lista){
	 $('#id_table').DataTable().clear();
	 $('#id_table').DataTable().destroy();
	 $('#id_table').DataTable({
			data: lista,
			searching: false,
			ordering: true,
			processing: true,
			pageLength: 5,
			lengthChange: false,
			columns:[
				{data:"idAlumno"},
				{data:"nombre"},
				{data:"dni"},
				{data:"correo"},
				{data:"fechaNacimiento"}
			]                                     
	    });
}
</script>

</body>
</html> 






