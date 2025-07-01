import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { RouterModule, Routes } from '@angular/router';
import { ClienteComponent } from './cliente/cliente.component';
import { FormClienteComponent } from './form-cliente/form-cliente.component';
import { MedicamentoFormComponent } from './form-medicamento/form-medicamento.component';
import { MedicamentoListComponent } from './medicamento/medicamento.component';

export const routes: Routes = [
  { path: '', redirectTo: 'clientes', pathMatch: 'full' },

  { path: 'clientes', component: ClienteComponent },
  { path: 'clientes/novo', component: FormClienteComponent },
  { path: 'clientes/alterar/:id', component: FormClienteComponent },

  { path: 'medicamentos', component: MedicamentoListComponent },
  { path: 'medicamentos/novo', component: MedicamentoFormComponent },
  { path: 'medicamentos/alterar/:id', component: MedicamentoFormComponent },

  { path: '**', redirectTo: 'clientes' }
];

@NgModule({
  imports: [
    RouterModule.forRoot(routes),
    ClienteComponent,
    FormClienteComponent,
    MedicamentoFormComponent,
    MedicamentoListComponent
  ],
  exports: [RouterModule, FormsModule],
  providers: []

})
export class AppRoutingModule {}