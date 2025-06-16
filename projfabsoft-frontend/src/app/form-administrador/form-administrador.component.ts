import { Component } from '@angular/core';
import { Administrador } from '../model/administrador';
import { AdministradorService } from '../service/Administrador.service';
import { HttpClientModule } from '@angular/common/http';
import { CommonModule } from '@angular/common';
import { FormsModule } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-form-administrador',
  imports: [],
  templateUrl: './form-administrador.component.html',
  styleUrl: './form-administrador.component.css'
});
export class FormAdministradorComponent {

}
