
function cadastrar(event){
	event.preventDefault();
	
	var requireds = document.getElementsByClassName('required')
	for(var i = 0; i < requireds.length; i++){
		if(requireds[i].value == "" || requireds[i].value == undefined){
			alert('Por favor, insira um '+requireds[i].name+' válido.');
			return;
		}
	}
	
	const form = document.getElementById('formulario');
	
	
		const email = document.getElementById('email').value;
		const senha = document.getElementById('senha').value;
		const confirmSenha = document.getElementById('confirmSenha').value;
		const celular = document.getElementById('number').value;
		
		if (!validateEmail(email)) {
			alert('Por favor, insira um email válido.');
			
			return;
		}
		
		if (senha.length < 8){
			alert('A senha deve ter pelo menos 8 caracteres.');
			event.preventDefault();
			return;
		}
		
		if (senha !== confirmSenha){
			alert('As senhas não coincidem.');
			event.preventDefault()
			return;
		}
		
		if (!validateCelular(celular)) {
			alert('Por favor, insira um número válido no formato (xx) xxxxx-xxxx.');
			event.preventDefault();
			return;
		}
		
		form.submit();
	
}
	
	function validateEmail(email){
		const regex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
		return regex.test(email);
	}

	function validateCelular(celular){
		const regex = /^\(\d{2}\) \d{5}-\d{4}$/;
		return regex.test(celular);
	}
