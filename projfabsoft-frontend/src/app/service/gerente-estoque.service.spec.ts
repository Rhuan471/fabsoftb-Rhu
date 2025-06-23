import { TestBed } from '@angular/core/testing';

import { GerenteEstoqueService } from './gerente-estoque.service';

describe('GerenteEstoqueService', () => {
  let service: GerenteEstoqueService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(GerenteEstoqueService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
