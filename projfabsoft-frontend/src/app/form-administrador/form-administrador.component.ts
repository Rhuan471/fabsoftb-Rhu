import { Component } from '@angular/core';
import { Administrador } from '../model/administrador';
import { AdministradorService } from '../service/Administrador.service';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-form-administrador',
  imports: [HttpClientModule, CommonModule, FormsModule],
  templateUrl: './form-administrador.component.html',
  styleUrl: './form-administrador.component.css',
  providers: [AdministradorService, Router]
})
export class FormAdministradorComponent {
export class FormClienteComponent {
    administrador: Administrador = new Administrador();

    constructor(
      private clienteService:AdministradorService,
      private router:Router,
      private activeRouter: ActivatedRoute
    ){
        const id = this.activeRouter.snapshot.paramMap.get("id");

        if (id) {
          this.AdministradorService.getClienteById(id).subscribe(Administrador => {
            this.cliente = Administrador;
          })
        }
    }

    salvar(){
      this.administradorService.saveCliente(this.cliente)
        .subscribe(resultado => {
            this.router.navigate(['clientes']);
  }
}