<%-- 
    Document   : registro
    Created on : 13/03/2017, 09:22:48 PM
    Author     : emi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tutoriales</title>
        <link rel="stylesheet "href="css/estilos.css" />
        <script src="js/script.js"></script>
    </head>
    <body>
        <h1>Bienvenido!</h1>
        <div id="login">
            <p>Registrate</p>
            <form action="Inserta" method="post" id="formulario">
                <p><input type="text" name="user" id="user" placeholder="Usuario"/></p>
                <p><input type="text" name="nombre" id="nombre" placeholder="Nombre"/></p>
                <p><input type="password" name="pass" id="pass" placeholder="contraseña" /></p>
                <p><input type="submit" name="Entrar" id="Entrar" value="entrar" /></p>
            </form>
        </div>
    </body>
</html>
