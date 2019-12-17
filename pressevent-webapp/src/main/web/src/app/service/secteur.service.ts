import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class SecteurService {
  url = 'http://localhost:3000/secteur';
  constructor(private http: HttpClient) { }
  getAll(): Observable<any> {
    return this.http.get(this.url)
  }
}
