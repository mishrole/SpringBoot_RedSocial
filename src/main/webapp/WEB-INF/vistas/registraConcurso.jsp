<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<!DOCTYPE html>
<html lang="esS" >
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/bootstrap.min.js"></script>
<script type="text/javascript" src="js/bootstrapValidator.js"></script>
<link rel="stylesheet" href="css/bootstrap.css"/>
<link rel="stylesheet" href="css/bootstrapValidator.css"/>
<title>Ejemplos de CIBERTEC - Jorge Jacinto </title>
</head>
<body>
	<div class="container">
		<h1>Registra Concurso</h1>
	
		<c:if test="${sessionScope.MENSAJE != null}">
			<div class="alert alert-success fade in" id="success-alert">
			 <a href="#" class="close" data-dismiss="alert">&times;</a>
			 <strong>${sessionScope.MENSAJE}</strong>
			</div>
		</c:if>
		<c:remove var="MENSAJE" />
		
		<form action="registroDeConcurso" id="id_form"> 
	
			<div class="form-group">
				<label class="control-label" for="id_nombre">Nombre</label>
				<input class="form-control" type="text" id="id_nombre" name="nombre" placeholder="Ingrese el nombre del concurso" maxlength="40">    
			</div>
			
			<div class="form-group">
				<label class="control-label" for="id_fecha_inicio">Fecha de Inicio</label>
				<input class="form-control" type="text" id="id_fecha_inicio" name="fechaInicio" placeholder="Ingrese la fecha" maxlength="100">    
			</div>
			
			<div class="form-group">
				<label class="control-label" for="id_fecha_fin">Fecha de Fin</label>
				<input class="form-control" type="text" id="id_fecha_fin" name="fechaFin" placeholder="Ingrese la fecha" maxlength="100">    
			</div>
			
			<div class="form-group">
				<label for="id_estado">Estado</label>
				<select id="id_estado" name="estado" class="form-control">
					<option value="Activo" >Activo</option>
					<option value="Inactivo" >Inactivo</option>
				</select>
			</div>
			
			<div class="form-group">
				<button type="submit" class="btn btn-primary">Crea Concurso</button>
			</div>
		</form>
	</div>
	
	<script type="text/javascript">
		$("#success-alert").fadeTo(1000, 500).slideUp(500, function(){
		    $("#success-alert").slideUp(500);
		});
	</script>
	
	<!-- https://mkyong.com/tutorials/java-regular-expression-tutorials/ -->
	
	<script type="text/javascript">
		$(document).ready(function() {
		    $('#id_form').bootstrapValidator({
		        message: 'This value is not valid',
		        feedbackIcons: {
		            valid: 'glyphicon glyphicon-ok',
		            invalid: 'glyphicon glyphicon-remove',
		            validating: 'glyphicon glyphicon-refresh'
		        },
		        fields: {
		        		nombre:{
		                    selector: "#id_nombre",
		                    validators:{
		                        notEmpty: {
		                             message: 'El nombre es obligatorio'
		                        },
		                        stringLength: {
		                            min: 3,
		                            max: 40,
		                            message: 'El nombre es de 3 a 40 caracteres'
		                        },
		                    }
		                },
		        }   
		    });
		
		    // Validate the form manually
		    $('#validateBtn').click(function() {
		        $('#id_form').bootstrapValidator('validate');
		    });
		});
	</script>
</body>
</html>




