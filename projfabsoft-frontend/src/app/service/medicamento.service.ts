import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { environment } from '../../environments/environment';
import { Medicamento } from '../entity/medicamento';

@Injectable({
  providedIn: 'root'
})
export class MedicamentoService {
  findById(id: any) {
    throw new Error('Method not implemented.');
  }
  private apiUrl = `${environment.apiBaseUrl}/medicamentos`;

  constructor(private http: HttpClient) { }

  buscarPorNome(nome: string): Observable<Medicamento[]> {
    return this.http.get<Medicamento[]>(`${this.apiUrl}?nome=${nome}`);
  }
  getAll(): Observable<Medicamento[]> {
    return this.http.get<Medicamento[]>(this.apiUrl);
  }
    getById(id: number): Observable<Medicamento> {
        return this.http.get<Medicamento>(`${this.apiUrl}/${id}`);
    }
    create(medicamento: Medicamento): Observable<Medicamento> {
        return this.http.post<Medicamento>(this.apiUrl, medicamento);
    }
    update(id: number, medicamento: Medicamento): Observable<Medicamento> {
        return this.http.put<Medicamento>(`${this.apiUrl}/${id}`, medicamento);
    }
    delete(id: number): Observable<void> {
        return this.http.delete<void>(`${this.apiUrl}/${id}`);
    }
}