import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Farmaceutico } from '../model/farmaceutico';

@Injectable({
  providedIn: 'root'
})
export class FarmaceuticoService {
  apiURL = "http://localhost:8080/api/v1/Farmaceutico";
  
  constructor(private http:HttpClient) { }

  getFarmaceuticos(){
    return this.http.get<Farmaceutico[]>(this.apiURL);
  }

  saveFarmaceutico(Farmaceutico:Farmaceutico){
    if(Farmaceutico.id){
      return this.http.put(this.apiURL + '/' + Farmaceutico.id, Farmaceutico);
    }
    return this.http.post(this.apiURL,Farmaceutico);
  }

  getFarmaceuticoById(id: any) {
    return this.http.get<Farmaceutico>(this.apiURL + '/' + id);
  }
}