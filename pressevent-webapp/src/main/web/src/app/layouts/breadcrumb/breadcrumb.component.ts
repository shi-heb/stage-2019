import { Component, OnDestroy ,EventEmitter, Output} from '@angular/core';
import { BreadcrumbService } from './breadcrumb.service';
import { Subscription } from 'rxjs';
import { MenuItem } from 'primeng/primeng';
import { Router } from '@angular/router';
import dayGridPlugin from '@fullcalendar/daygrid';
import timeGridPlugin from '@fullcalendar/timegrid';
import interactionPlugin from '@fullcalendar/interaction';
import { EvenementService } from 'src/app/service/evenement.service';
import {} from 'googlemaps';

@Component({
  selector: 'app-breadcrumb',
  templateUrl: './breadcrumb.component.html',
  styleUrls: ['./breadcrumb.component.sass']
})
export class BreadcrumbComponent implements OnDestroy {
    Options: any;
    overlays: any[];
    name: string;
    menu: Array<any> = [];
    breadcrumbList: Array<any> = [];
    display: boolean = false;
    vue: boolean = false;
    options: any;

    subscription: Subscription;
    events:  Array<{title: string, start: string}> = []; 
    items: MenuItem[];
    constructor(private _router: Router, private menuService: BreadcrumbService,private eventService:EvenementService) {}

    ngOnInit() {
      this.Options = {
        center: {lat: 35.8283991, lng:10.583035 },
        zoom: 12
    };
    this.overlays = [
      new google.maps.Marker({position: {lat: 35.8283991, lng: 10.583035 }, title:"sousse"})
  ];
      this.find();
      this.menu = this.menuService.getMenu();
      this.listenRouting();
      this.options = {
        plugins: [dayGridPlugin, timeGridPlugin, interactionPlugin],
        editable: true
      };
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
  
    showDialog(){
      this.display = true;
      console.log(this.display)
    }
    affiche(){
      this.vue = true;
    }


    listenRouting() {
      let routerUrl: string, routerList: Array<any>, target: any;
      this._router.events.subscribe((router: any) => {
        routerUrl = router.urlAfterRedirects;
        if (routerUrl && typeof routerUrl === 'string') {
          target = this.menu;
          this.breadcrumbList.length = 0;
          routerList = routerUrl.slice(1).split('/');
          routerList.forEach((router, index) => {
            target = target.find(page => page.path.slice(2) === router);
            this.breadcrumbList.push({
              name: target.name,
              path: (index === 0) ? target.path : `${this.breadcrumbList[index-1].path}/${target.path.slice(2)}`
            });
            if (index+1 !== routerList.length) {
              target = target.children;
            }
          });
          // console.log(this.breadcrumbList);

        }
      });
    }

    ngOnDestroy() {
        if (this.subscription) {
            this.subscription.unsubscribe();
        }
    }
}
