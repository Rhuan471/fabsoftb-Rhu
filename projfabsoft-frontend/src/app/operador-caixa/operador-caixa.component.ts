import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { Component } from '@angular/core';
import { RouterLink } from '@angular/router';
import { OperadorCaixa } from '../model/OperadorCaixa';
import { OperadorCaixaService } from '../service/OperadorCaixa.service';

@Component({
  selector: 'app-operador-caixa',
  imports: [HttpClientModule, CommonModule, RouterLink],
  templateUrl: './operador-caixa.component.html',
  styleUrl: './operador-caixa.component.css',
  providers: [OperadorCaixaService],
})
export class OperadorCaixaComponent {
  operadoresCaixa: OperadorCaixa[] = [];

  constructor(private operadorCaixaService: OperadorCaixaService) {
    this.listarOperadoresCaixa();
  }

  listarOperadoresCaixa() {
    this.operadorCaixaService.getOperadoresCaixa()
      .subscribe(operadores => {
        this.operadoresCaixa = operadores;
      });
  }
}
