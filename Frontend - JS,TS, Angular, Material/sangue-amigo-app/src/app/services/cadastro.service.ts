import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import { Observable } from 'rxjs';
import { environment } from '../../environments/environment';
import {CadastroPessoaFisica} from '../interfaces/cadastro.pessoa.fisica.interface';
import { Usuario } from '../interfaces/cadastro.usuario.interface';

@Injectable({
  providedIn: 'root'
})
export class CadastroService {

   private url = `${environment.api}/cadastro`;

constructor(private httpclient:HttpClient) { }

//enviarDados(cadastro: CadastroPessoaFisica){
  //return this.httpclient.post<CadastroPessoaFisica>(this.url, cadastro);
 //}
 enviarDados(cadastro:Usuario | CadastroPessoaFisica){
  return this.httpclient.post<Usuario | CadastroPessoaFisica>(this.url, cadastro);
 }

}

