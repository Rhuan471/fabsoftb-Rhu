import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { Component, Inject } from '@angular/core';
import { RouterLink } from '@angular/router';
import { OperadorCaixa } from '../model/OperadorCaixa';
// Update the import path and filename to match the actual file, e.g.:
import { OperadorCaixaService } from '../service/operador-caixa.service';

@Component({
  selector: 'app-operador-caixa',
  imports: [HttpClientModule, CommonModule, RouterLink],
  templateUrl: './operador-caixa.component.html',
  styleUrl: './operador-caixa.component.css',
  providers: [OperadorCaixaService],
})
export class OperadorCaixaComponent {
  operadoresCaixa: OperadorCaixa[] = [];

  constructor(@Inject(OperadorCaixaService) private operadorCaixaService: OperadorCaixaService) {
    this.listarOperadoresCaixa();
  }

  listarOperadoresCaixa() {
    this.operadorCaixaService.getOperadoresCaixa()
      .subscribe((operadores: OperadorCaixa[]) => {
        this.operadoresCaixa = operadores;
      });
  }
}
