<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta charset="utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1">

</head>
<link rel="stylesheet" href="styles.css">
<meta charset="UTF-8">
<link  type="text/css" rel="stylesheet"  href="style.css" />
<link rel="stylesheet" href="styles.css">
<meta charset="UTF-8">
<link  type="text/css" rel="stylesheet"  href="style.css" />

<body>
		

<div class="container">

	
								</ul>
							</li>
						</ul>
					</div>
				</div>
			</nav>
		</div>
	</div>
	
	<div class="row espace"></div>
	
	<div class="row">
		<div class="col-lg-12"><br>
			<center><div class="corps-entete"><center>EFFECTUER UN VIREMENT</center></div><br><br>
			<div class="corps-contenu">
				<form method="post" action="ProxiBanqueV2/VirementServlet">
					<div class="form-group">
						<label for="debiteurVirement">Numéro du compte à débiter</label>
						<input id="debiteurVirement" class="form-control" name="debiteurVirement" type="number" placeholder="Identifiant du débiteur">
					</div>
					<div class="form-group">
						<label for="crÃ©diteurVirement">Numéro du compte à créditer</label>
						<input id="crÃ©diteurVirement" class="form-control" name="crediteurVirement" type="number" placeholder="Identifiant du créditeur">
					</div>
					<div class="form-group">
						<label for="sommeVirement">Somme</label>
						<input id="sommeVirement" class="form-control" name="sommeVirement" type="number" placeholder="Entrez la somme">
					</div>
					<div class="button-right">
					<center><button id="buttonCreateClient" class="btn btn-primary" type="submit">Appliquer</button></center>
					</div>
				</form>
			</div>
		</div>
	</div>
	
	
	<footer>
    
    </footer>
    
</div>

</body>
</html>
