<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ page import="fr.gtm.proxibanquev2.domaine.Client"%>
<%@ page import="fr.gtm.proxibanquev2.dao.ClientDao"%>
<%@ page import="java.util.ArrayList"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<meta charset="ISO-8859-1">
<title>LISTE CLIENTS</title>

</head>
<link rel="stylesheet" href="styles.css">
<meta charset="UTF-8">
<link type="text/css" rel="stylesheet" href="style.css" />
<link rel="stylesheet" href="styles.css">

<body>


	<center>
		<h1>BIENVENUE SUR LE SITE DE LA BANQUE PROXIBANQUE</h1>
	</center>
	</div>

	<div class="item2">

		<ul>
			<h4>MENU:</h4>
			<li><h3>
					<a href="formulaire.jsp"> Edition d'un client</a>
				</h3></li>
			<li><h3>
					<a href=""> Liste comptes d'un client</a>
				</h3></li>
			<li><h3>
					<a href="virement.jsp"> Virement compte à compte</a>
				</h3></li>
		</ul>
	</div>


	<div class="item3">
		<center>
			<form>
				<%
					Client client = (Client) session.getAttribute("client");
				%>
			</form>

			<h1></h1>

			<table border="1px" cellpadding="0" cellspacing="0">

				<caption>LISTE DES CLIENTS DEPUIS LA BD :</caption>

				<tr>
					<th>idClient</th>
					<th>Nom</th>
					<th>Prenom</th>
					<th>email</th>
					<th>adresse</th>
				</tr>

				<c:forEach items="${Listeclients}" var="client">

					<tr>
						<td><c:out value="${client.idClient }"></c:out></td>

						<td><c:out value="${client.nom }"></c:out></td>

						<td><c:out value="${client.prenom }"></c:out></td>

						<td><c:out value="${client.email}"></c:out></td>

						<td><c:out value="${client.adresse}"></c:out></td>
					<tr />
					<br>

					</div>

					</div>

				</c:forEach>
</body>
</html>