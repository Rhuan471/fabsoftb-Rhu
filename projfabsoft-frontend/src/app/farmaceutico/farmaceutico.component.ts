import { Component } from '@angular/core';
import { Router, Routes } from '@angular/router';
import { FarmaceuticoService } from '../service/farmaceutico.service';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { RouterLink } from '@angular/router';
import { Farmaceutico } from '../model/farmaceutico';

@Component({
  selector: 'app-farmaceutico',
  imports: [HttpClientModule, CommonModule],
  templateUrl: './cliente.component.html',
  styleUrl: './cliente.component.css',
  providers: [FarmaceuticoService, Router]
})

export class ClienteComponent {
    listaFarmaceuticos: Farmaceutico[] = [];
  FarmaceuticoService: any;

    constructor(
      private clienteService: FarmaceuticoService,
      private router:Router
    ) {}

    novo() {
      this.router.navigate(['clientes/novo']);
    }

    ngOnInit(){
      console.log("Carregando clientes...");
      this.FarmaceuticoService.getFarmaceuticos().subscribe(
        (Farmaceuticos: Farmaceutico[]) => {
          this.listaFarmaceuticos = Farmaceuticos;
        }
      );
    }

    alterar(Farmaceutico:Farmaceutico){
      this.router.navigate(['clientes/alterar', Farmaceutico.id]);
    }

}