import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormGerenteEstoqueComponent } from './form-gerente-estoque.component';

describe('FormGerenteEstoqueComponent', () => {
  let component: FormGerenteEstoqueComponent;
  let fixture: ComponentFixture<FormGerenteEstoqueComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FormGerenteEstoqueComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FormGerenteEstoqueComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
