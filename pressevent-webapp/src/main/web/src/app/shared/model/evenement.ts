export class Evenement{
    constructor(
        public id?:number,
        public nom?:string,
        public DatePub?:Date,
        public datedebut?:Date,
        public type?:string,
        public secteur?:string,
        public createdby?:string,
        public description?:string,
        public contact?:string,
        public rue?:string,
        public ville?:string,
        public pays?:string,
        public image?:string
        ){
        }
}