import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class EvenementService {
  url = 'http://localhost:3000/evenments';
  constructor(private http: HttpClient) { }
  getAll(): Observable<any> {
    return this.http.get(this.url)
  }
  add(evenment):Observable<any>{
    return this.http.post(this.url,evenment)
  }
  update(id,evenment):Observable<any>{
    return this.http.patch(this.url+`/${id}`,evenment);
  }
  delete(id):Observable<any>{
    return this.http.delete(this.url+`/${id}`);
  }
}
