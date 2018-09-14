<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<%@ page import ="fr.gtm.proxibanquev2.domaine.Client" %>
    
<html>
		<head>
			<meta charset="ISO-8859-1">
			<title>LES DONNEES CLIENT SONT MODIFIEES </title>
		</head>
		
		<body>	
			<% 
			Client client = (Client) session.getAttribute("client");
			%>
			<h1>Informations Client</h1>
			
			<ul>
				<li>Nom : <%=client.getNom()%>
				<li>Prenom : <%=client.getPrenom()%>
				<li>Email : <%=client.getEmail()%>
				<li>Adresse : <%=client.getAdresse()%>
			</ul>
					
		</body>
</html>