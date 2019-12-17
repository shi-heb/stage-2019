import { FormGroup } from '@angular/forms';
import { Secteur } from './../../shared/model/secteur';
import { Type } from './../../shared/model/type';
import {MenuItem, SelectItem} from 'primeng/api';
import { SecteurService } from './../../service/secteur.service';
import { TypeService } from './../../service/type.service';
import { Evenement } from './../../shared/model/evenement';
import { EvenementService } from './../../service/evenement.service';
import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-evenement',
  templateUrl: './evenement.component.html',
  styleUrls: ['./evenement.component.sass']
})
export class EvenementComponent implements OnInit {
  evenement: Evenement = new Evenement();
  types: Type[]
  secteurs: Secteur[]
  text: string;
  evenements:Evenement[]
  events:  Array<{title: string, start: string}> = []; 
  options: any;
  lat:string='';
  lng:string='';
  Location:Object;
  secteur:string;
  operation:string ='rien';
  items2: MenuItem[];
  displayDialog: boolean;
  sortOptions: SelectItem[];
  sortField: string;
  sortOrder: number;
  constructor(private eventService:EvenementService,private servicetype:TypeService, private secteurService:SecteurService) { }
  ChangingValue() {
    //console.log(secteur)
}
see(){
  //console.log(this.secteur)
}
addnew(){
  this.operation="add";
  this.newEvenement();
  this.displayDialog = false;
  
}
onaffiche(evenement){
  this.evenement = this.cloneEvent(evenement);
  this.displayDialog = true;
}
cloneEvent(e: Evenement): Evenement {
  let evenement = {};
  for (let prop in e) {
    evenement[prop] = e[prop];
  }
  return evenement;
}

newEvenement(): void {
  this.evenement = new Evenement();
}
onSortChange(event) {
  let value = event.value;

  if (value.indexOf('!') === 0) {
      this.sortOrder = -1;
      this.sortField = value.substring(1, value.length);
  }
  else {
      this.sortOrder = 1;
      this.sortField = value;
  }
}
clean(){
  this.displayDialog=false;
}
  ngOnInit() {
    this.sortOptions = [
      {label: 'date publicité', value: '!DatePub'},
      {label: 'Date debut', value: 'datedebut'}
  ];
  //   this.items2 = [
  //     {
  //         label: 'Info',
  //         icon: 'pi pi-info-circle',
  //         command: (event => console.log("hhhhhhh"))
  //     },
  //     {
  //         label: 'Edit',
  //         icon: 'pi pi-fw pi-pencil',
  //         command: (event => console.log("ediiiiiiiiit"))
  //     }
  // ];
    this.loadEvents();
    this.find();
    // this.map.getLocation().subscribe(data=>{
    //   console.log(data);
    //   this.lat = data.latitude ;
    //   this.lng = data.longitude ;
    // });
   
    this.loadTypes();
    this.loadsecteurs();
  }

  find(){
    this.eventService.getAll().subscribe(
      d => { d.forEach(item => {
          this.events = [...this.events,
            {
                "title": item.nom ,
                "start": item.datedebut
            }
          ];
          
        });
        //console.log(this.events);

       });
  }
  retour(){
    this.operation="rien";
  }
  loadEvents(){
    this.eventService.getAll().subscribe(
      d => {this.evenements = d
       });
  }
  loadsecteurs(){
    this.secteurService.getAll().subscribe(
      d => {this.secteurs=d
       });
  }
  loadTypes(){
    this.servicetype.getAll().subscribe(
      di => {this.types = di       
      });
  }
  add(){
    this.eventService.add(this.evenement)
      .subscribe(data => 
        {console.log(data)
        this.loadEvents();
        }
      , error => console.log(error));
      this.evenement = new Evenement();
      this.operation='rien'
      console.log(this.evenement)
  }
  deleteEvent(id) {
    this.eventService.delete(id)
      .subscribe(
        data => {
          console.log(data);
          this.loadEvents();
          this.displayDialog = false;
        },
        error => console.log(error));
  }
  updateEvent(event) {
    this.operation="edit";
    this.evenement=event;
    this.displayDialog = false;
  }
  selectEvenement(event, evenement){
    this.evenement=evenement
    this.displayDialog = true;
    event.preventDefault();
  }
  onSelectFile(event){
    const name_file = event.files[0];
    console.log(name_file.name);
    this.evenement.image=name_file.name;
  }
  update(evenement){
    this.eventService.update(this.evenement.id,evenement).subscribe(
      data => {
        this.loadEvents();
        this.evenement = new Evenement();
        this.operation='rien'
      },
      
      error => console.log(error));
  }
}