import { Component } from '@angular/core';
import { RouterOutlet } from '@angular/router';

import { CadastroComponent } from './components/cadastro/cadastro.component';
import { HomeComponent } from './components/home/home.component';
import { LoginComponent } from './components/login/login.component';
import { NavbarComponent } from './components/navbar/navbar.component';
import { ParceirosComponent } from './components/parceiros/parceiros.component';

@Component({
  selector: 'app-root',
  standalone: true,
  imports: [
    RouterOutlet,
    CadastroComponent,
    HomeComponent,
    LoginComponent,
    NavbarComponent,
    ParceirosComponent,
  ],
  templateUrl: './app.component.html',
  styleUrl: './app.component.scss',
})
export class AppComponent {
  title = 'sangue-amigo-app';
}
