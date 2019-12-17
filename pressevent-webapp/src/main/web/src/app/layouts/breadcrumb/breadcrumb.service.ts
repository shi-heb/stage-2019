import { Injectable } from '@angular/core';
import { Subject ,  Observable } from 'rxjs';
import { MenuItem } from 'primeng/primeng';

@Injectable()
export class BreadcrumbService {

    private itemsSource = new Subject<MenuItem[]>();

    itemsHandler = this.itemsSource.asObservable();

    setItems(items: MenuItem[]) {
        this.itemsSource.next(items);
    }
    getMenu(): Array<any> {
        const menu = [
          { name: 'home', path: './home'},
          { name: 'user', path: './user'},
          { name: 'event', path: './event'}
        ];
    
        return menu;
      }
}
