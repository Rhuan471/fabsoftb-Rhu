import { Routes } from '@angular/router';
import { ClienteComponent } from './cliente/cliente.component';
import { Cliente } from './model/cliente';

export const routes: Routes = [
    {path:'clientes', component: ClienteComponent}
];
