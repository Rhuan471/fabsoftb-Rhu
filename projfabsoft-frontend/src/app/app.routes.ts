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


export const Approutes: Routes = [
  { path: '', redirectTo: 'clientes', pathMatch: 'full' },
  { path:'clientes', component: ClienteComponent},
  { path: 'clientes/novo', component: FormClienteComponent},
  { path: 'clientes/alterar/:id', component: FormClienteComponent},

  // Paths para Administrador
  { path: '', redirectTo: 'Administrador', pathMatch: 'full' },
  { path:'administradores', component: AdministradorComponent}, // Substitua 'AdministradorComponent' pelo seu componente de listagem
  { path: 'administradores/novo', component: FormAdministradorComponent}, // Substitua 'FormAdministradorComponent' pelo seu componente de formulário
  { path: 'administradores/alterar/:id', component: FormAdministradorComponent},

  // Paths para Farmacêutico
  { path: '', redirectTo: 'Farmaceutico', pathMatch: 'full' },
  { path:'farmaceuticos', component: FarmaceuticoComponent}, // Substitua 'FarmaceuticoComponent' pelo seu componente de listagem
  { path: 'farmaceuticos/novo', component: FormFarmaceuticoComponent}, // Substitua 'FormFarmaceuticoComponent' pelo seu componente de formulário
  { path: 'farmaceuticos/alterar/:id', component: FormFarmaceuticoComponent},

  // Paths para Operador de Caixa
  { path: '', redirectTo: 'Operador de caixa', pathMatch: 'full' },
  { path:'operadores-caixa', component: OperadorCaixaComponent}, // Substitua 'OperadorCaixaComponent' pelo seu componente de listagem
  { path: 'operadores-caixa/novo', component: FormOperadorCaixaComponent}, // Substitua 'FormOperadorCaixaComponent' pelo seu componente de formulário
  { path: 'operadores-caixa/alterar/:id', component: FormOperadorCaixaComponent},

  { path: '', redirectTo: 'gerente de estoque', pathMatch: 'full' },
  { path:'gerentes-estoque', component: GerenteEstoqueComponent}, // Substitua 'GerenteEstoqueComponent' pelo seu componente de listagem
  { path: 'gerentes-estoque/novo', component: FormGerenteEstoqueComponent}, // Substitua 'FormGerenteEstoqueComponent' pelo seu componente de formulário
  { path: 'gerentes-estoque/alterar/:id', component: FormGerenteEstoqueComponent}
];