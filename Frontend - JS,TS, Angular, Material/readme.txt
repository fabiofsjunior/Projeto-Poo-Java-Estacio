Testando 17/05 - 12:25

################################################
	Estrutura de pastas FRONTEND
//Pastas e Subpastas
*SangueAmigoApp*
	> App (Main)
	> Assets (anexos, imagens, etc)
	*$> Components:* 
		>Home-(Index, Login)
		>Cadastro (Forms)
		*$>Home-Perfis:*
			>Usuario
			>Doador
			>Instituição
		*$>Parceiros*
	*$>Services:*
		>Formulários(POST/UPDATE/DELETE)
		>ConsultasNoBanco(GET)
		>Parceiros(GET)


################################################


node --version = v20.11.1


######################

Angular CLI: 17.3.0
Node: 20.11.1
Package Manager: npm 9.4.2
OS: win32 x64

Angular:
...

Package                      Version
------------------------------------------------------
@angular-devkit/architect    0.1703.0 (cli-only)
@angular-devkit/core         17.3.0 (cli-only)
@angular-devkit/schematics   17.3.0 (cli-only)
@schematics/angular          17.3.0 (cli-only)


#######################

https://angular.io/quick-start

https://angular.io/cli

ng new sangue-amigo-app --routing

ng add @angular/material

ng serve


 press r + enter to force reload browser
  press u + enter to show server url
  press o + enter to open in browser
  press c + enter to clear console
  press q + enter to quit


#######################

<!-- Importação do TAILWIND-->
<script src="https://cdn.tailwindcss.com"></script>

#######################
ENDPOINTS

URL PADRÃO http://localhost:8080/api

POST/GET
http://localhost:8080/api/usuario
http://localhost:8080/api/pessoafisica
http://localhost:8080/api/instituicao

UPDATE/DELETE
ENDPOINT PARA UPDATE = http://localhost:8080/api/usuario/{id}
http://localhost:8080/api/pessoafisica/{id}
http://localhost:8080/api/instituicao/{id}





