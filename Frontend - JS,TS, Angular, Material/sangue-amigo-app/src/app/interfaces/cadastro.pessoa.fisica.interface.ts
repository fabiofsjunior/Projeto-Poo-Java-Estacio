export interface CadastroPessoaFisica {
  secondFormGroup: Partial<{
    cpf: string | null;
    dataNascimento: string | null;
    fatorSanguineo: string | null;
    dataUltimaDoacao: string | null;
    doadorMedula: string | null;
    grauPrioridade: string | null;
}>

  //cpf: string,
  //dataNascimento: string,
  //fatorSanguineo: string,
  //dataUltimaDoacao: string,
  //doadorMedula: string,
  //restricao: string,
  //grauPrioridade: string
}
