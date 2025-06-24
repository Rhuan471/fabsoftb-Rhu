import { Routes } from '@angular/router';
import { Component } from '@angular/core';
import { GerenteEstoque } from '../model/gerente-estoque';
import { GerenteEstoqueService } from '../service/gerente-estoque.service';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';


@Component({
  selector: 'app-form-gerente-estoque',
  imports: [HttpClientModule, CommonModule, FormsModule],
  templateUrl: './form-gerente-estoque.component.html',
  styleUrl: './form-gerente-estoque.component.css',
  providers: [GerenteEstoqueService, Router]
})
export class FormGerenteEstoqueComponent {
  gerenteEstoque: GerenteEstoque = {} as GerenteEstoque;

  constructor(
    private gerenteEstoqueService: GerenteEstoqueService,
    private router: Router
  ) {}

  salvar() {
    this.gerenteEstoqueService.saveGerenteEstoque(this.gerenteEstoque)
      .subscribe((resultado: any) => {
        this.router.navigate(['gerentes-estoque']);
      });
  }
}
