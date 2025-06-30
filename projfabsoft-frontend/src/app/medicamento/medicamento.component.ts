// medicamento-list.component.ts
import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Medicamento } from '../entity/Medicamento';
import { MedicamentoService } from '../service/medicamento.service';

@Component({
  selector: 'app-medicamento-list',
  templateUrl: './medicamento-list.component.html',
  styleUrls: ['./medicamento-list.component.css']
})
export class MedicamentoListComponent implements OnInit {
  medicamentos: Medicamento[] = [];

  constructor(
    private medicamentoService: MedicamentoService,
    private router: Router
  ) { }

  ngOnInit(): void {
    this.loadMedicamentos();
  }

  loadMedicamentos(): void {
    this.medicamentoService.getAll().subscribe(
      data => this.medicamentos = data,
      error => console.error('Erro ao carregar medicamentos', error)
    );
  }

  novoMedicamento(): void {
    this.router.navigate(['/medicamentos/novo']);
  }

  buscarMedicamento(): void {
    this.router.navigate(['/medicamentos/buscar']);
  }

  editarMedicamento(id: number): void {
    this.router.navigate([`/medicamentos/alterar/${id}`]);
  }

  deletarMedicamento(id: number): void {
    if (confirm('Tem certeza que deseja remover este medicamento?')) {
      this.medicamentoService.delete(id).subscribe(
        () => {
          this.loadMedicamentos();
        },
        error => console.error('Erro ao remover medicamento', error)
      );
    }
  }
}