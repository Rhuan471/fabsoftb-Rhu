import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Farmaceutico } from '../model/farmaceutico';
import { FarmaceuticoService } from '../service/farmaceutico.service';

@Component({
  selector: 'app-farmaceutico',
  templateUrl: './farmaceutico.component.html',
  styleUrls: ['./farmaceutico.component.css'],
  providers: [FarmaceuticoService]
})
export class FarmaceuticoComponent implements OnInit {
  listaFarmaceuticos: Farmaceutico[] = [];

  constructor(
    private farmaceuticoService: FarmaceuticoService,
    private router: Router
  ) {}

  ngOnInit(): void {
    console.log("Carregando farmacêuticos...");
    this.farmaceuticoService.getFarmaceuticos().subscribe(
      (farmaceuticos: Farmaceutico[]) => {
        this.listaFarmaceuticos = farmaceuticos;
      },
      (error) => {
        console.error('Erro ao carregar farmacêuticos', error);
      }
    );
  }

  novo(): void {
    this.router.navigate(['farmaceuticos/novo']);
  }

  alterar(farmaceutico: Farmaceutico): void {
    this.router.navigate(['farmaceuticos/alterar', farmaceutico.id]);
  }
}
