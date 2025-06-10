import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormOperadorCaixaComponent } from './form-operador-caixa.component';

describe('FormOperadorCaixaComponent', () => {
  let component: FormOperadorCaixaComponent;
  let fixture: ComponentFixture<FormOperadorCaixaComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FormOperadorCaixaComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FormOperadorCaixaComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
