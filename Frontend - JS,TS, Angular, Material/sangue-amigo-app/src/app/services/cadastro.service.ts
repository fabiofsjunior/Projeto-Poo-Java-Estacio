import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http"
import { Observable } from 'rxjs';
import { environment } from '../../environments/environment';

@Injectable({
  providedIn: 'root'
})
export class CadastroService {

   private url = environment.api;

constructor(private httpclient:HttpClient) { }
}
 //sendDados(secondFormGroup: CadastroPessoaFisica){
   //const dados: CadastroPessoaFisica = { cpf, dataNascimento, fatorSanguineo, dataUltimaDoacao, doadorMedula, restricao, grauPrioridade };

 // return this.httpclient.post<CadastroPessoaFisica>(this.url, secondFormGroup);
//}


//Observable<CadastroPessoaFisica>
//cpf: string, dataNascimento: string, fatorSanguineo: string, dataUltimaDoacao: string, doadorMedula: string, restricao:string, grauPrioridade: string
