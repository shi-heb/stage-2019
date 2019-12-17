import { Routes, RouterModule } from '@angular/router';
import { ModuleWithProviders, NgModule } from '@angular/core';
import { MainComponent } from './layouts/main/main.component';
import { UserComponent } from './layouts/user/user.component';
import { EvenementComponent } from './layouts/evenement/evenement.component';

// import { DocumentationComponent } from './demo/view/documentation.component';

export const routes: Routes = [
	{ path : '',redirectTo:'home', pathMatch: 'full'},
	{ path : 'home',component: MainComponent },
	{ path : 'user',  component: UserComponent },
	{ path : 'event',  component: EvenementComponent }
];

@NgModule({
	imports: [RouterModule.forRoot(routes)],
	exports: [RouterModule]
  })
  export class AppRoutes { }