import { BrowserModule } from '@angular/platform-browser';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { NgModule } from '@angular/core';
import { AppRoutes } from './app.routes';
import { HttpClientModule } from '@angular/common/http';
import { FormsModule } from '@angular/forms';
import { MessageService } from './shared/service/message.service';
import { BreadcrumbService } from './layouts/breadcrumb/breadcrumb.service';
import {AccordionModule} from 'primeng/accordion';     
import { ChartModule } from 'primeng/chart';
import {ButtonModule} from 'primeng/button';
import { DropdownModule } from 'primeng/dropdown';
import { TableModule } from 'primeng/table';
import { ScrollPanelModule } from 'primeng/scrollpanel';
import { VirtualScrollerModule } from 'primeng/virtualscroller';
import {PaginatorModule} from 'primeng/paginator';
import {EditorModule} from 'primeng/editor';
import { DataViewModule } from 'primeng/dataview';
import { MultiSelectModule } from 'primeng/multiselect';
import { PanelModule } from 'primeng/panel';
import { CalendarModule } from 'primeng/calendar';
<<<<<<< HEAD
import { ReactiveFormsModule } from '@angular/forms';
import {SplitButtonModule} from 'primeng/splitbutton';
import {GMapModule} from 'primeng/gmap';
=======
>>>>>>> e0b96b7ad7a545e962acc37ea9efd70ff4337b16
import {CardModule} from 'primeng/card';
import { AppComponent } from './app.component';
import { TopbarComponent } from './layouts/topbar/topbar.component';
import { AppMenuComponent, AppSubMenuComponent } from './layouts/menu/menu.component';
import {AutoCompleteModule} from 'primeng/autocomplete';
import {RadioButtonModule} from 'primeng/radiobutton';
import { AppProfileComponent } from './app.profile.component';
import { MainComponent } from './layouts/main/main.component';
import { BreadcrumbComponent } from './layouts/breadcrumb/breadcrumb.component';
import { UserComponent } from './layouts/user/user.component';
import { EvenementComponent } from './layouts/evenement/evenement.component';
import {FileUploadModule} from 'primeng/fileupload';
import {FullCalendarModule} from 'primeng/fullcalendar';
<<<<<<< HEAD
import {ContextMenuModule} from 'primeng/contextmenu';
import { DialogModule } from 'primeng/primeng';
import { AgmCoreModule } from '@agm/core';
import {ListboxModule} from 'primeng/listbox';


=======
>>>>>>> e0b96b7ad7a545e962acc37ea9efd70ff4337b16

@NgModule({
  declarations: [
    AppComponent,
    TopbarComponent,
    AppMenuComponent,
    AppSubMenuComponent,
    AppProfileComponent,
    MainComponent,
    BreadcrumbComponent,
    UserComponent,
    EvenementComponent

    
  ],
  imports: [
    BrowserModule,
    BrowserAnimationsModule,
	DropdownModule,
	HttpClientModule,
    AppRoutes,
    ScrollPanelModule,
  TableModule,
  EditorModule,
  GMapModule,
  DialogModule,
  PaginatorModule,
  ButtonModule,
  SplitButtonModule,
	VirtualScrollerModule,
  FormsModule ,
  ListboxModule,
  ReactiveFormsModule,
  ContextMenuModule,
	DataViewModule,
	MultiSelectModule,
	PanelModule,
  CalendarModule,
  ChartModule,
  CardModule,
  AutoCompleteModule,
  RadioButtonModule,
  FileUploadModule,
  FullCalendarModule,
  AccordionModule,
  FormsModule
  ],
  providers: [
	  // our application services
	  MessageService,
	  BreadcrumbService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
