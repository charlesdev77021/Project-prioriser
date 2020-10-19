import { IonicModule, IonicRouteStrategy } from '@ionic/angular';
import { Component } from '@angular/core';


@Component({
  selector: 'app-home',
  templateUrl: 'home.page.html',
  styleUrls: ['home.page.scss'],
})
export class HomePage {
  capital;
  alimentation;
  water;
  energy;
  helth;
  education;
  recreation;
  others;
  constructor() {

  }
  prioriserFunc(){
  var cap = parseFloat(this.capital);

  var ali = parseFloat(this.alimentation);
  var wat = parseFloat(this.water);
  var ener = parseFloat(this.energy);
  var helth = parseFloat(this.helth);
  var educ = parseFloat(this.education);
  var recre = parseFloat(this.recreation);
  var oth = parseFloat(this.others);

    var expenses  = (ali + wat + ener + helth + educ + recre + oth);

    var finalNumber = cap - expenses;

    var finalSTR = String(finalNumber);

 

    if(expenses  > cap)
    {
      alert("Contas altas demais. Revise-as!");
      document.querySelector("#result").innerHTML = "Faltaram R$ " + finalSTR;

    }else if(expenses == cap) {
      alert("Contas em ordem, mas não sobrará nada ao final do mês. Revise suas despesas.");
      document.querySelector("#result").innerHTML = "R$ " + finalSTR;
    }
 else
    {
      alert("Contas em ordem. Parabéns!!!");
      document.querySelector("#result").innerHTML = "Sobram R$ " + finalSTR;


    }

  }

}
