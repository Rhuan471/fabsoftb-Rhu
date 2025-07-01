import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { GerenteEstoque } from '../model/gerente-estoque';
import { GerenteEstoqueService } from '../service/gerente-estoque.service';

@Component({
  selector: 'app-form-gerente-estoque',
  templateUrl: './form-gerente-estoque.component.html',
  styleUrls: ['./form-gerente-estoque.component.css'],
  providers: [GerenteEstoqueService]  
})
export class FormGerenteEstoqueComponent {
  gerenteEstoque: GerenteEstoque = {} as GerenteEstoque;

  constructor(
    private gerenteEstoqueService: GerenteEstoqueService,
    private router: Router
  ) {}

  salvar() {
    this.gerenteEstoqueService.saveGerenteEstoque(this.gerenteEstoque)
      .subscribe({
        next: (resultado: any) => {
          this.router.navigate(['gerentes-estoque']);
        },
        error: (err) => {
          console.error('Erro ao salvar gerente de estoque', err);
        }
      });
  }
}
