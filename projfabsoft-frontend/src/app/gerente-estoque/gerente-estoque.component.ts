import { Component } from '@angular/core';
import { GerenteEstoque } from '../model/gerente-estoque';
import { GerenteEstoqueService } from '../service/gerente-estoque.service';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-gerente-estoque',
  imports: [HttpClientModule, CommonModule, RouterLink],
  templateUrl: './gerente-estoque.component.html',
  styleUrl: './gerente-estoque.component.css',
  providers: [GerenteEstoqueService],
});
export class GerenteEstoqueComponent {
  gerentesEstoque: GerenteEstoque[] = [];

  constructor(private gerenteEstoqueService: GerenteEstoqueService) {
    this.listarGerentesEstoque();
  }

  listarGerentesEstoque() {
    this.gerenteEstoqueService.getGerentesEstoque()
      .subscribe((gerentes: GerenteEstoque[]) => {
        this.gerentesEstoque = gerentes;
      });
  }
}
