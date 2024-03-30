import { Routes } from '@angular/router';

import { CadastroComponent } from './components/cadastro/cadastro.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { ParceirosComponent } from './components/parceiros/parceiros.component';
import { PessoaFisicaComponent } from './components/home/pessoa-fisica/pessoa-fisica.component';
import { InstituicaoComponent } from './components/home/instituicao/instituicao.component';

export const routes: Routes = [
  { path: '', title: 'SangueAmigoApp|Home', component: HomeComponent }, // Cada Componente deve ser chamado aqui
  { path: 'cadastro', title: 'Cadastro', component: CadastroComponent }, // Cada Componente deve ser chamado aqui
  { path: 'login', title: 'Login', component: LoginComponent }, // Cada Componente deve ser chamado aqui
  { path: 'pessoa', title: 'PessoaFisica', component: PessoaFisicaComponent }, // Cada Componente deve ser chamado aqui
  { path: 'instituicao', title: 'Instituicao', component: InstituicaoComponent }, // Cada Componente deve ser chamado aqui
  { path: 'parceiros', title: 'Parceiros', component: ParceirosComponent }, // Cada Componente deve ser chamado aqui
];
