import { Routes } from '@angular/router';

import { AdministradorComponent } from './administrador/administrador.component';
import { ClienteComponent } from './cliente/cliente.component';
import { FarmaceuticoComponent } from './farmaceutico/farmaceutico.component';
import { FormAdministradorComponent } from './form-administrador/form-administrador.component';
import { FormClienteComponent } from './form-cliente/form-cliente.component';
import { FormFarmaceuticoComponent } from './form-farmaceutico/form-farmaceutico.component';
import { FormGerenteEstoqueComponent } from './form-gerente-estoque/form-gerente-estoque.component';
import { FormOperadorCaixaComponent } from './form-operador-caixa/form-operador-caixa.component';
import { GerenteEstoqueComponent } from './gerente-estoque/gerente-estoque.component';
import { OperadorCaixaComponent } from './operador-caixa/operador-caixa.component';
import { MedicamentoListComponent } from './medicamento/medicamento.component';
import { MedicamentoFormComponent } from './form-medicamento/form-medicamento.component';

export const routes: Routes = [
  // Redirect padrão para clientes
  { path: '', redirectTo: 'clientes', pathMatch: 'full' },

  // Rotas clientes
  { path: 'clientes', component: ClienteComponent },
  { path: 'clientes/novo', component: FormClienteComponent },
  { path: 'clientes/alterar/:id', component: FormClienteComponent },

  // Rotas administradores
  { path: 'administradores', component: AdministradorComponent },
  { path: 'administradores/novo', component: FormAdministradorComponent },
  { path: 'administradores/alterar/:id', component: FormAdministradorComponent },

  // Rotas medicamentos
  { path: 'medicamentos', component: MedicamentoListComponent },
  { path: 'medicamentos/novo', component: MedicamentoFormComponent },
  { path: 'medicamentos/alterar/:id', component: MedicamentoFormComponent },

  // Rotas farmaceuticos
  { path: 'farmaceuticos', component: FarmaceuticoComponent },
  { path: 'farmaceuticos/novo', component: FormFarmaceuticoComponent },
  { path: 'farmaceuticos/alterar/:id', component: FormFarmaceuticoComponent },

  // Rotas operadores de caixa
  { path: 'operadores-caixa', component: OperadorCaixaComponent },
  { path: 'operadores-caixa/novo', component: FormOperadorCaixaComponent },
  { path: 'operadores-caixa/alterar/:id', component: FormOperadorCaixaComponent },

  // Rotas gerentes de estoque
  { path: 'gerentes-estoque', component: GerenteEstoqueComponent },
  { path: 'gerentes-estoque/novo', component: FormGerenteEstoqueComponent },
  { path: 'gerentes-estoque/alterar/:id', component: FormGerenteEstoqueComponent },

  // Caso nenhuma rota bata
  { path: '**', redirectTo: 'clientes' }
];