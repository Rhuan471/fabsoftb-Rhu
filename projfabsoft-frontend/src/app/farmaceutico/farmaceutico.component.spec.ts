import { ComponentFixture, TestBed } from '@angular/core/testing';

import { FarmaceuticoComponent } from './farmaceutico.component';

describe('FarmaceuticoComponent', () => {
  let component: FarmaceuticoComponent;
  let fixture: ComponentFixture<FarmaceuticoComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      imports: [FarmaceuticoComponent]
    })
    .compileComponents();

    fixture = TestBed.createComponent(FarmaceuticoComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
