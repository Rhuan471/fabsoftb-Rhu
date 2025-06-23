import { TestBed } from '@angular/core/testing';

import { OperadorCaixaService } from './operador-caixa.service';

describe('OperadorCaixaService', () => {
  let service: OperadorCaixaService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(OperadorCaixaService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
