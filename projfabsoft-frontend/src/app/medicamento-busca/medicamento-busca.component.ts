// medicamento-search.component.ts
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Medicamento } from '../entity/medicamento';
import { MedicamentoService } from '../service/medicamento.service';

@Component({
  selector: 'app-medicamento-search',
  templateUrl: './medicamento-busca.component.html',
  styleUrls: ['./medicamento-busca.component.css']
})
export class MedicamentoSearchComponent implements OnInit {
  resultados: Medicamento[] = [];
  tipoBusca: string = '';
  termoBusca: string = '';

  constructor(
    private medicamentoService: MedicamentoService,
    private route: ActivatedRoute,
    private router: Router
  ) { }

  ngOnInit(): void {
    this.route.queryParams.subscribe(params => {
      if (params['nome']) {
        this.tipoBusca = 'nome';
        this.termoBusca = params['nome'];
        this.buscarPorNome(params['nome']);
      } else if (params['principioAtivo']) {
        this.tipoBusca = 'principioAtivo';
        this.termoBusca = params['principioAtivo'];
        this.buscarPorPrincipioAtivo(params['principioAtivo']);
      } else if (params['codigoBarras']) {
        this.tipoBusca = 'codigoBarras';
        this.termoBusca = params['codigoBarras'];
        this.buscarPorCodigoBarras(params['codigoBarras']);
      } else {
        this.buscarDisponiveis();
      }
    });
  }

  buscarPorNome(nome: string): void {
    this.medicamentoService.buscarPorNome(nome).subscribe(
      data => this.resultados = data,
      error => console.error('Erro na busca por nome', error)
    );
  }

  buscarPorPrincipioAtivo(principioAtivo: string): void {
    this.medicamentoService.buscarPorPrincipioAtivo(principioAtivo).subscribe(
      data => this.resultados = data,
      error => console.error('Erro na busca por princípio ativo', error)
    );
  }

  buscarPorCodigoBarras(codigoBarras: string): void {
    this.medicamentoService.buscarPorCodigoBarras(codigoBarras).subscribe(
      data => this.resultados = data,
      error => console.error('Erro na busca por código de barras', error)
    );
  }

  buscarDisponiveis(): void {
    this.medicamentoService.buscarDisponiveis().subscribe(
      data => this.resultados = data,
      error => console.error('Erro na busca por disponíveis', error)
    );
  }

  voltar(): void {
    this.router.navigate(['/medicamentos']);
  }
}