import { Routes } from '@angular/router';
import { ClienteComponent } from './cliente/cliente.component';
import { FormClienteComponent } from './form-cliente/form-cliente.component';
import { MedicamentoFormComponent } from './form-medicamento/form-medicamento.component';
import { MedicamentoListComponent } from './medicamento/medicamento.component';

export const routes: Routes = [
  // Redirect padrão para clientes
  { path: '', redirectTo: 'clientes', pathMatch: 'full' },

  // Rotas clientes
  { path: 'clientes', component: ClienteComponent },
  { path: 'clientes/novo', component: FormClienteComponent },
  { path: 'clientes/alterar/:id', component: FormClienteComponent },

  // Rotas medicamentos
  { path: 'medicamentos', component: MedicamentoListComponent },
  { path: 'medicamentos/novo', component: MedicamentoFormComponent },
  { path: 'medicamentos/alterar/:id', component: MedicamentoFormComponent },

  // Caso nenhuma rota bata
  { path: '**', redirectTo: 'clientes' }
];