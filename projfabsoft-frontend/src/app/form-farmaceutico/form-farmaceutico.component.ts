import { Routes } from '@angular/router';
import { Component } from '@angular/core';
import { Farmaceutico } from '../model/Farmaceutico';
import { FarmaceuticoService } from '../service/Farmaceutico.service';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-form-farmaceutico',
  imports: [HttpClientModule, CommonModule, FormsModule],
  templateUrl: './form-farmaceutico.component.html',
  styleUrl: './form-farmaceutico.component.css',
  providers: [FarmaceuticoService, Router]
})
export class FormFarmaceuticoComponent {
  farmaceutico: Farmaceutico = new Farmaceutico();
  constructor(
    private farmaceuticoService: FarmaceuticoService,
    private router: Router
  ) {}
  salvar() {
    this.farmaceuticoService.saveFarmaceutico(this.farmaceutico)
      .subscribe(resultado => {
        this.router.navigate(['farmaceuticos']);
      });
  }

}
