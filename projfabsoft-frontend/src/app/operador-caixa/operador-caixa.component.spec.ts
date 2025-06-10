import { ComponentFixture, TestBed } from '@angular/core/testing';

import { OperadorCaixaComponent } from './operador-caixa.component';

describe('OperadorCaixaComponent', () => {
  let component: OperadorCaixaComponent;
  let fixture: ComponentFixture<OperadorCaixaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [OperadorCaixaComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(OperadorCaixaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
