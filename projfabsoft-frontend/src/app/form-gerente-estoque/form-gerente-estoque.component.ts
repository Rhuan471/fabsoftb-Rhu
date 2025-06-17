import { Routes } from '@angular/router';
import { Component } from '@angular/core';
import { GerenteEstoque } from '../model/GerenteEstoque';
import { GerenteEstoqueService } from '../service/GerenteEstoque.service';
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
});
export class FormGerenteEstoqueComponent {
  gerenteEstoque: GerenteEstoque = new GerenteEstoque();

  constructor(
    private gerenteEstoqueService: GerenteEstoqueService,
    private router: Router
  ) {}

  salvar() {
    this.gerenteEstoqueService.saveGerenteEstoque(this.gerenteEstoque)
      .subscribe(resultado => {
        this.router.navigate(['gerentes-estoque']);
      });
  }
}
