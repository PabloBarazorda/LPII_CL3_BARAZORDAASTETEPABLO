<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>login usuario</title>
</head>
<body bgcolor="c5dec5" text-align="center">
    <h2 align="center">Inicio de Sesi�n</h2>
    <div align="center">
    
    <form action="ControladorLogin" method="post">
        <table border="1">
        <td for="nombre">Nombre de Usuario:</td>
        <td><input type="text" id="nombre" name="nombre" required><td/>
        <tr>
        <td for="contrasena">Contrase�a:</td>
        <td><input type="password" id="contrasena" name="contrasena" required><td/>
        <tr>
        <td colspan="2" align="center"><input type="submit" value="Iniciar Sesi�n"><td/>
    </table>
    </div>
    </form>
</body>
</html>