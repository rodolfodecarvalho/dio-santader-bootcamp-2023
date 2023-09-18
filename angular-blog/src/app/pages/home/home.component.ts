import { Component, OnInit } from '@angular/core';
import { Language } from 'src/app/model/language';
import { dataMock } from 'src/assets/data/dataMock';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css'],
})
export class HomeComponent implements OnInit {
  languageDetail?: Language;

  languages: Language[] = [];

  ngOnInit(): void {
    this.languageDetail = dataMock.find((l) => l.id === '1');

    this.languages = JSON.parse(JSON.stringify(dataMock));
    this.languages.splice(0, 1);
  }
}
