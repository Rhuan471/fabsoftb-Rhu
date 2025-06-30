// medicamento-form.component.ts
import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Medicamento } from '../entity/medicamento';
import { MedicamentoService } from '../service/medicamento.service';

@Component({
  selector: 'app-medicamento-form',
  templateUrl: './medicamento-form.component.html',
  styleUrls: ['./medicamento-form.component.css']
})
export class MedicamentoFormComponent implements OnInit {
  medicamento: Medicamento = new Medicamento();
  isEdit: boolean = false;

  constructor(
    private medicamentoService: MedicamentoService,
    private route: ActivatedRoute,
    private router: Router
  ) { }

  ngOnInit(): void {
    const id = this.route.snapshot.params['id'];
    if (id) {
      this.isEdit = true;
      this.medicamentoService.findById(id).subscribe(
        data => this.medicamento = data,
        error => console.error('Erro ao carregar medicamento', error)
      );
    }
  }

  onSubmit(): void {
    if (this.isEdit) {
      this.medicamentoService.update(this.medicamento.id, this.medicamento).subscribe(
        () => {
          this.router.navigate(['/medicamentos']);
        },
        error => console.error('Erro ao atualizar medicamento', error)
      );
    } else {
      this.medicamentoService.create(this.medicamento).subscribe(
        () => {
          this.router.navigate(['/medicamentos']);
        },
        error => console.error('Erro ao criar medicamento', error)
      );
    }
  }

  voltar(): void {
    this.router.navigate(['/medicamentos']);
  }
}