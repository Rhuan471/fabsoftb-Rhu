import { Component } from '@angular/core';
import { Routes } from '@angular/router';
import { FormFarmaceuticoComponent } from './form-farmaceutico.component';
import { FarmaceuticoService } from '../service/farmaceutico.service';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { RouterLink } from '@angular/router';

@Component({
  selector: 'app-farmaceutico',
  imports: [],
  templateUrl: './farmaceutico.component.html',
  styleUrl: './farmaceutico.component.css'
});
export class FarmaceuticoComponent {

}
