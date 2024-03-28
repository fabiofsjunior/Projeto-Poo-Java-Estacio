ENDPOINTS Api: 

GET:

"/api/bancosangue"

"/api/instituicao"

"/api/pessoafisica"

"/api/usuario"


POST - "/api/usuario"
PUT - "/api/usuario/{id}"
DELETE -"/api/usuario/{id}"

########################
JSON EXEMPLO: 

USUARIO: 
{
    "nomeCompleto": "Ana Julia Santos Silva Teste",
    "login": "anaclara123",
    "senha": "def5678",
    "endereco": "Rua das Flores, 25, São Paulo, SP",
    "telefone": "11 9 9876-5432",
    "tipoUsuario": "DOADOR",
    "pessoaFisicaEntity": {
        "idPessoaFisica": 3,
        "cpf": "123.456.789-00",
        "dataNascimento": "10-01-1990",
        "fatorSanguineo": "A_POSITIVO",
        "dataUltimaDoacao": "10-01-2020",
        "doadorMedula": "DOADOR_MEDULA",
        "restricao": true,
        "grauPrioridade": "MEDIA"
    }
}

########################

PESSOAFISICA: 
{
        "idPessoaFisica": 2,
        "cpf": "123.456.789-00",
        "dataNascimento": "10-01-1990",
        "fatorSanguineo": "A_POSITIVO",
        "dataUltimaDoacao": "10-01-2020",
        "doadorMedula": "DOADOR_MEDULA",
        "restricao": true,
        "grauPrioridade": "MEDIA"
}


