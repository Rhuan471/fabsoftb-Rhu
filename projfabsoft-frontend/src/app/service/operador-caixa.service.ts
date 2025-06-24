import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { OperadorCaixa } from '../model/operador-caixa';
export interface Cliente {
  id?: number;
  nome: string;
  email: string;
}

@Injectable({
  providedIn: 'root'
})
export class OperadorCaixaService {
  getOperadoresCaixa() {
    return this.http.get<OperadorCaixa[]>(this.apiURL);
  }
  apiURL = "http://localhost:8080/api/v1/operador-caixa";
  
  constructor(private http:HttpClient) { }

  getOperadorCaixa(){

  }

  saveOperadorCaixa(OperadorCaixa:OperadorCaixa){
    if(OperadorCaixa.id){
      return this.http.put(this.apiURL + '/' + OperadorCaixa.id, OperadorCaixa);
    }
    return this.http.post(this.apiURL,OperadorCaixa);
  }

  getClienteById(id: any) {
    return this.http.get<Cliente>(this.apiURL + '/' + id);
  }
}
