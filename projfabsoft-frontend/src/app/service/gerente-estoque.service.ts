// ...other imports
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { GerenteEstoque } from '../model/gerente-estoque';

export class GerenteEstoqueService {
  constructor(private http: HttpClient) {}

  getGerentesEstoque(): Observable<GerenteEstoque[]> {
    return this.http.get<GerenteEstoque[]>('URL_TO_API_ENDPOINT');
  }
}