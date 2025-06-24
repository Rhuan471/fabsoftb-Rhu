import { Injectable } from '@angular/core';
import { Administrador } from '../model/administrador';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AdministradorService {
  getAdministradores: any;
  getAdministrador() {
    throw new Error('Method not implemented.');
  }
  apiURL = "http://localhost:8080/api/v1/administrador";
  
  constructor(private http:HttpClient) { }

  getClientes(){
    return this.http.get<Administrador[]>(this.apiURL);
  }

  saveAdministrador(cliente:Administrador){
    if(Administrador.id){
      return this.http.put(this.apiURL + '/' + Administrador.id, Administrador);
    }
    return this.http.post(this.apiURL,Administrador);
  }

  getAdministradorById(id: any) {
    return this.http.get<AdministradorService>(this.apiURL + '/' + id);
  }
}
