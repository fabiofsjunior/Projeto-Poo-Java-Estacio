import { HttpClientModule } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormBuilder, FormControl, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { MatButtonModule } from '@angular/material/button';
import { MatCalendarCellClassFunction, MatDatepickerModule } from '@angular/material/datepicker';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatStepperModule } from '@angular/material/stepper';
import { environment } from '../../../environments/environment';
import { CadastroService } from '../../services/cadastro.service';
import { CadastroPessoaFisica } from '../../interfaces/cadastro.pessoa.fisica.interface';
import { Observable } from 'rxjs';
import { Usuario } from '../../interfaces/cadastro.usuario.interface';


@Component({
  selector: 'app-cadastro',
  standalone: true,
  imports: [
    MatButtonModule,
    MatStepperModule,
    FormsModule,
    ReactiveFormsModule,
    MatFormFieldModule,
    MatInputModule,
    MatDatepickerModule,
    HttpClientModule,
    FormsModule,
  ],
  providers:[CadastroService],
  templateUrl: './cadastro.component.html',
  styleUrl: './cadastro.component.scss',
})
export class CadastroComponent {

  firstFormGroup = this._formBuilder.group({
    usuario: ['', Validators.required],
  });
  secondFormGroup = this._formBuilder.group({
    cpf: ['', Validators.required],
    dataNascimento: ['', Validators.required],
    fatorSanguineo: ['', Validators.required],
    dataUltimaDoacao: ['', Validators.required],
    doadorMedula: ['', Validators.required],
    grauPrioridade: ['', Validators.required],
  });
  thirdFormGroup = this._formBuilder.group({
    nome: ['', Validators.required],
    login: ['', Validators.required],
    senha: ['', Validators.required],
    telefone: ['', Validators.required],

  });
  isEditable = true;

  //cadastro: CadastroPessoaFisica[] = []
  //cadastro$ = new Observable<CadastroPessoaFisica[]>();
  cadastro$ = new Observable<Usuario[]>();
  constructor(private cadastroService: CadastroService,
    private _formBuilder: FormBuilder) {

  }

  sendDados() {
    //if (!this.firstFormGroup || !this.secondFormGroup || !this.thirdFormGroup)
      //return;
    //this.cadastroService.enviarDados()
    //.subscribe(cadastro => this.cadastro = cadastro) "pode ficar vivo na memoria"
    //secondFormGroup: this.secondFormGroup
   //this.cadastroService.enviarDados({ secondFormGroup : this.secondFormGroup.value})
    //.subscribe()

    //const formValues = this.secondFormGroup.value;

    this.cadastroService.enviarDados({ thirdFormGroup : this.thirdFormGroup.value , secondFormGroup : this.secondFormGroup.value})
     .subscribe()




    console.log(this.thirdFormGroup.value);
    console.log('To aqui', environment.api);


}
}
