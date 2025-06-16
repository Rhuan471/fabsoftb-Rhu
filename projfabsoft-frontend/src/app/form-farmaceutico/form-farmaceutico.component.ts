import { Routes } from '@angular/router';
import { FarmaceuticoComponent } from '../farmaceutico/farmaceutico.component';
import { FormFarmaceuticoComponent } from './form-farmaceutico.component';
import { Component } from '@angular/core';

@Component({
  selector: 'app-form-farmaceutico',
  imports: [],
  templateUrl: './form-farmaceutico.component.html',
  styleUrl: './form-farmaceutico.component.css'
});
export const routes: Routes = [
  { path: 'farmaceutico', component: FarmaceuticoComponent },
  { path: 'farmaceutico/form', component: FormFarmaceuticoComponent },
];
