<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>${message}</title>
</head>
<body>
	<h1>${message}</h1>

	<form:form action="${pageContext.request.contextPath}/formData" method="post" modelAttribute="product">
		<label>Nombre : </label><form:input type="text" name="nombre" path="nombre"/><br>
		<form:errors path="nombre" cssStyle="color:#FF0000;"/><br>
		
		<label>Marca: </label><form:input type="text" name="marca" path="marca"/><br>	
		<form:errors path="marca" cssStyle="color:#FF0000;"/><br>
		
		<label>Descripción: </label><form:input type="text" name="descripcion" path="descripcion"/><br>
		<form:errors path="descripcion" cssStyle="color:#FF0000;"/><br>
		
		<label>Categoría: </label><form:input type="text" name="categoria" path="categoria"/><br>
		<form:errors path="categoria" cssStyle="color:#FF0000;"/><br>
		
		<label>Fecha de vencimiento: </label><form:input type="text" name="fechav" placeholder="dd/mm/yyyy" path="fechav"/><br>
		<form:errors path="fechav" cssStyle="color:#FF0000;"/><br>
		
		<label>Precio: </label><form:input type="number" min="0.00" max="1000000.00" step="0.01" name="precio" path="precio"/><br>
		<form:errors path="precio" style="#FF0000;"/><br>
		
		<input type="submit" value="Enviar">
	</form:form>
	
</body>
</html>