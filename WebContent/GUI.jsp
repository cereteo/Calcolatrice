<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<section style="text-align: center;">
		<div>
			<form method="post" action="DemoServlet">
		<div>
			<input type="text" name="number1" placeholder="Numero 1" autocomplete="off">
			<input type="text" name="number2" placeholder="Numero 2" autocomplete="off">
		</div>
		<div>
			<div>
				<input type="submit" name="ope" value="+">
				<input type="submit" name="ope" value="-">
				<input type="submit" name="ope" value="*">
				<input type="submit" name="ope" value="/">
			</div>
		</div>
	</form>
	<div>
		<span>Result:</span> <input type="text" name="result" placeholder="Risultato" autocomplete="off" disabled="true" value="${result}">
	</div>
		</div>
	</section>
</body>
</html>