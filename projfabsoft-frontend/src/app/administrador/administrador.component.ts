import { Component } from '@angular/core';
import { Administrador } from '../model/administrador';
import { Router } from '@angular/router';
import { AdministradorService } from '../service/administrador.service';

@Component({
  selector: 'app-administrador',
  imports: [],
  templateUrl: './administrador.component.html',
  styleUrl: './administrador.component.css'
})

export class AdministradorComponent {
excluir(_t11: any) {
throw new Error('Method not implemented.');
}
  listaClientes: Administrador[] = [];
listaAdministrador: any;

  constructor(
    private administradorService: AdministradorService,
    private router:Router
  ) {}

  novo() {
    this.router.navigate(['clientes/novo']);
  }

  ngOnInit(){
    console.log("Carregando clientes...");
    this.administradorService.getAdministradores().subscribe(
      (      administradores: Administrador[]) => {
        this.listaClientes = administradores;
      }
    );
  }

  alterar(cliente:Administrador){
    this.router.navigate(['administradores/alterar', Administrador.id]);
  }
}
