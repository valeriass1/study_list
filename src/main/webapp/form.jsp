<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet" href="/study_list/css/style.css">
<link rel="icon" href="/study_list/images/logo (2).svg" type="x-icon">

<title>Formulário de Cadastro</title>
</head>

<body class="form-body">
	<div class="container">
		<div class="table-container">
			<table>
				<thead>
					<tr>
						<th>Nome</th>
						<th>Sobrenome</th>
						<th>Email</th>
						<th>Celular</th>
						<th>Gênero</th>
					</tr>
				</thead>
				<tbody>

					<c:if test="${not empty usuarios }">
						<c:forEach var="u" items="${usuarios}">
							<tr>
								<td>${u.nome}</td>
								<td>${u.sobrenome}</td>
								<td>${u.email}</td>
								<td>${u.celular}</td>
								<td>${u.genero}</td>
							</tr>
						</c:forEach>
					</c:if>


				</tbody>
			</table>
		</div>
		<div class="form">
			<form action="usuarios" id="formulario" method="POST">
				<div class="form-header">
					<div class="title">
						<h1>cadastre-se</h1>
					</div>
				</div>

				<div class="input-group">
					<div class="input-box">
						<label for="firstname">Nome</label> <input id="firstname"
							type="text" name="nome"
							placeholder="Digite seu primeiro nome" required>
					</div>

					<div class="input-box">
						<label for="lastname">Sobrenome</label> <input id="lastname"
							type="text" name="sobrenome" placeholder="Digite seu sobrenome"
							required>
					</div>

					<div class="input-box">
						<label for="email">Email</label> <input id="email" type="email"
							name="email" placeholder="Digite seu e-mail" required>
					</div>

					<div class="input-box">
						<label for="number">Celular</label> <input id="number" type="tel"
							name="celular" placeholder="(xx) xxxxx-xxxx" required>
					</div>

					<div class="input-box">
						<label for="password">Senha</label> <input id="password"
							type="password" name="senha" placeholder="Digite sua senha"
							required>
					</div>

					<div class="input-box">
						<label for="password">Confirme sua senha</label> <input
							id="password" type="password" name="confirmpassword"
							placeholder="Digite sua senha" required>
					</div>
				</div>

				<div class="gender-inputs">
					<div class="gender-title">
						<h6>Gênero</h6>
					</div>

					<div class="gender-group">
						<div class="gender-input">
							<input type="radio" value="0" id="female" name="genero"> <label
								for="female">Feminino</label>
						</div>

						<div class="gender-input">
							<input type="radio"  value="1" id="male" name="genero"> <label
								for="male">Masculino</label>
						</div>

						<div class="gender-input">
							<input type="radio"  value="2" id="others" name="genero"> <label
								for="others">Outros</label>
						</div>

						<div class="gender-input">
							<input type="radio"  value="3" id="none" name="genero"> <label
								for="none">Prefiro não dizer</label>
						</div>
					</div>
				</div>

				<div class="continue-button">
					<button onclick="document.getElementById('formulario').submit()">
						<a href="#">Continuar</a>
					</button>
				</div>
			</form>

			<div class="login-button">
				<button>
					<a href="#">Entrar</a>
				</button>
			</div>
			<div class="login-button-one">
				<p>Já possui cadastro?</p>
			</div>
		</div>
	</div>
</body>

</html>