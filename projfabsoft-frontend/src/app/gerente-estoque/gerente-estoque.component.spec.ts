import { ComponentFixture, TestBed } from '@angular/core/testing';

import { GerenteEstoqueComponent } from './gerente-estoque.component';

describe('GerenteEstoqueComponent', () => {
  let component: GerenteEstoqueComponent;
  let fixture: ComponentFixture<GerenteEstoqueComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [GerenteEstoqueComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(GerenteEstoqueComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
