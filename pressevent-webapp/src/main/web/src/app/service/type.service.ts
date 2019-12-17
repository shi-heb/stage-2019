import { Observable } from 'rxjs';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class TypeService {

  url = 'http://localhost:3000/type';
  constructor(private http: HttpClient) { }
  getAll(): Observable<any> {
    return this.http.get(this.url)
  }
}
