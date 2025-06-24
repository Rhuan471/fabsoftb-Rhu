import { Component } from '@angular/core';
import { Administrador } from '../model/administrador';
import { AdministradorService } from '../service/administrador.service';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-form-administrador',
  imports: [HttpClientModule, CommonModule, FormsModule],
  templateUrl: './form-administrador.component.html',
  styleUrl: './form-administrador.component.css',
  providers: [AdministradorService, Router]
})
export class FormAdministradorComponent {
    administrador: Administrador = new Administrador();

    constructor(
      private administradorService: AdministradorService,
      private router: Router,
      private activeRouter: ActivatedRoute
    ) {
        const id = this.activeRouter.snapshot.paramMap.get("id");

        if (id) {
          this.administradorService.getAdministradorById(id).subscribe((administrador: Administrador) => {
            this.administrador = administrador;
          });
        }
    }

    salvar() {
      this.administradorService.saveAdministrador(this.administrador)
        .subscribe((resultado: any) => {
            this.router.navigate(['administradores']);
        });
    }
}