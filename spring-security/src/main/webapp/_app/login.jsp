<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html lang="pt-br">
    <head>
        <meta charset="UTF-8">
		<title>Bem vindo(a), Login</title>
	</head>
	<body>
		<center>
			<form name="work_login" action="login.html" method="post">
				<fieldset>
					<legend>
						<h2>Login Form</h2>
					</legend>
					<label>
						<span>E-mail:</span><br />
						<input type="email" name="email" placeholder="Informe o E-mail" required />
					</label><br />
					<label>
						<span>Senha:</span><br />
						<input type="password" name="senha" placeholder="Informe a Senha" required />
					</label><br /><br />
					
					<button type="submit" name="entrar">Entrar</button>
				</fieldset>
			</form>
		</center>
	</body>
</html>