import { HttpClientModule } from '@angular/common/http';
import { Component } from '@angular/core';
import { FormBuilder, FormControl, FormsModule, ReactiveFormsModule, Validators } from '@angular/forms';
import { MatButtonModule } from '@angular/material/button';
import { MatCalendarCellClassFunction, MatDatepickerModule } from '@angular/material/datepicker';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material/input';
import { MatStepperModule } from '@angular/material/stepper';
import { environment } from '../../../environments/environment';
import {CadastroService} from '../../services/cadastro.service';

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
  //providers:[CadastroService],
  templateUrl: './cadastro.component.html',
  styleUrl: './cadastro.component.scss',
})
export class CadastroComponent {

  firstFormGroup = this._formBuilder.group({
    usuario: ['', Validators.required],
  });
  secondFormGroup = this._formBuilder.group({
    cpf: ['',Validators.required],
    dataNasc: ['',Validators.required],
    dataDoa: ['',Validators.required],
    sangue: ['',Validators.required],
    medula: ['',Validators.required],
    prioridade: ['',Validators.required],
  });
  thirdFormGroup = this._formBuilder.group({
    nome: ['', Validators.required],
    login: ['',Validators.required],
    senha: ['',Validators.required],
    telefone: ['',Validators.required],

  });
  isEditable = true;

  // newsRegisterForms!: FormGroup;

  // constructor() {
  //    this.newsRegisterForms = new FormGroup({
  //      cpf: new FormControl('', [Validators.required]),
  //      dataNasc: new FormControl('', [Validators.required]),
  //      dataDoa: new FormControl('', [Validators.required]),
  //      sangue: new FormControl('', [Validators.required]),
  //      medula: new FormControl('', [Validators.required]),
  //      prioridade: new FormControl('', [Validators.required]),
  //    });
  //  }
  constructor(//private cadastro: CadastroService,
    private _formBuilder: FormBuilder) { }

  sendDados(){
    ///if (!this.firstFormGroup || !this.secondFormGroup || !this.thirdFormGroup)
     // return;

    //this.CadastroService.sendDados({})


    //const secondFormGroup: CadastroPessoaFisica ={
    //cpf: (''),
    //dataNascimento: (''),
    //fatorSanguineo: (''),
    //dataUltimaDoacao: (''),
    //doadorMedula: (''),
    //restricao: (''),
    //grauPrioridade: (''),
    //}
     //console.log('To aqui', environment.api);
     console.log(this.secondFormGroup);

  }

  //this.CadastroService.sendDados(secondFormGroup)
    //.then(CadastroPessoaFisica = console.log("adicionado"));
    //.cath(error = console.error(error));
}
