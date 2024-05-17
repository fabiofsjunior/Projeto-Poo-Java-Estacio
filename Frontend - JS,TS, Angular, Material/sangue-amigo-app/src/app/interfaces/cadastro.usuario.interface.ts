export interface Usuario{
  thirdFormGroup : Partial<{
  nomeCompleto: string| null;
  login: string| null;
  senha: string| null;
  endereco: string| null;
  telefone: string| null;
  firstFormGroup : Partial<{
  tipoUsuario: string| null;
  }>
  //pessoaFisicaEntity: 'CadastroPessoaFisica';
}>
}
