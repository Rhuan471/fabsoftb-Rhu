// ...other imports
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { GerenteEstoque } from '../model/gerente-estoque';

export class GerenteEstoqueService {
  apiURL = "http://localhost:8080/api/v1/gerente-estoque";
  
  constructor(private http:HttpClient) { }

  getGerentes(){
    return this.http.get<GerenteEstoque[]>(this.apiURL);
  }

  saveGerenteEstoque(GerenteEstoque:GerenteEstoque){
    if(GerenteEstoque.id){
      return this.http.put(this.apiURL + '/' + GerenteEstoque.id, GerenteEstoque);
    }
    return this.http.post(this.apiURL,GerenteEstoque);
  }

  getGerenteEstoqueById(id: number): Observable<GerenteEstoque> {
    return this.http.get<GerenteEstoque>(`${this.apiURL}/${id}`);
  }
}