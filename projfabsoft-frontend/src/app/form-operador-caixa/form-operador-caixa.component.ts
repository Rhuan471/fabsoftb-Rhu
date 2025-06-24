import { Routes } from '@angular/router';
import { Component } from '@angular/core';
import { OperadorCaixa } from '../model/OperadorCaixa';
import { OperadorCaixaService } from '../service/OperadorCaixa.service';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-form-operador-caixa',
  imports: [HttpClientModule, CommonModule, FormsModule],
  templateUrl: './form-operador-caixa.component.html',
  styleUrl: './form-operador-caixa.component.css',
  providers: [OperadorCaixaService, Router]
})
export class FormOperadorCaixaComponent {
  operadorCaixa: OperadorCaixa = new OperadorCaixa();

  constructor(
    private operadorCaixaService: OperadorCaixaService,
    private router: Router
  ) {}

  salvar() {
    this.operadorCaixaService.saveOperadorCaixa(this.operadorCaixa)
      .subscribe(resultado => {
        this.router.navigate(['operadores-caixa']);
      });
  }
}
