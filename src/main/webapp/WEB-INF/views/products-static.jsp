<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Catalogue de produits</title>
	<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/resources/css/style.css">
</head>
<body>
	<div id="formProducts">
		<form method="post" action="saveProduct">
		<table   class="table1">
			<tr><th>Référence:</th><td></td><td><input value ="ABC"/></td></tr>
			<tr><th>Désignation:</th><td></td><td><input value ="Livre Spring"/></td></tr>
			<tr><th>Prix:</th><td></td><td><input value ="25"/></td></tr>
			<tr><th>Quantité:</th><td></td><td><input value ="10"/></td></tr>
			<tr><td><input type="submit" value="Save"></td></tr>
		</table>
		</form>
	</div>
	<div id="listProducts">
		<table class="table1">
			<tr><th>REF</th><th>DESIGNATION</th><th>PRIX</th><th>QUANTITE</th><th></th><th></th></tr>
			<!-- c:forEach items=""-->
				<tr><td>ABC1</td><td>Livre1 Spring par la pratique</td><td>25</td><td>10</td><td><a href="deleteProduct?ref=">Supprimer</a></td><td><a href="editProduct?ref=">Modifier</a></td></tr>
				<tr><td>ABC2</td><td>Livre2 Spring par la pratique</td><td>20</td><td>20</td><td><a href="deleteProduct?ref=">Supprimer</a></td><td><a href="editProduct?ref=">Modifier</a></td></tr>
				<tr><td>ABC3</td><td>Livre3 Spring par la pratique</td><td>30</td><td>05</td><td><a href="deleteProduct?ref=">Supprimer</a></td><td><a href="editProduct?ref=">Modifier</a></td></tr>

			<!-- /c:forEach-->
		</table>
	</div>
</body>
</html>
