import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FormFarmaceuticoComponent } from './form-farmaceutico.component';

describe('FormFarmaceuticoComponent', () => {
  let component: FormFarmaceuticoComponent;
  let fixture: ComponentFixture<FormFarmaceuticoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FormFarmaceuticoComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FormFarmaceuticoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
