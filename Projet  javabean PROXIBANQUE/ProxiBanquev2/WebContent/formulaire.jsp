<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title> UPDATE CLIENT</title>

<body>
	<form method="POST" action="MaServlet2">
	  <fieldset>
	    <legend> SAISIR LES NOUVELLES DONNEES:</legend>
	    
	    Nom:<br>
	    <input type="text" name="newnomuser" value="monNom"><br>
	    prenom:<br>
	    <input type="text" name="newprenomuser" value="monprenom"><br>
	    Email:<br>
	     <input type="text" name="newemailuser" value="monemail"><br>
	    Adresse:<br>
	     <input type="text" name="newadresseuser" value="monadresse"><br>
	        
	    <input type="submit" value="Submit">
	  </fieldset>
	</form>

</body>
</html>
