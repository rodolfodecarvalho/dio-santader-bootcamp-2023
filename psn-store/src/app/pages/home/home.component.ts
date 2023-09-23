import { GameService } from './../../services/game.service';
import { Component, OnInit } from '@angular/core';
import { Observable } from 'rxjs';
import { Game } from 'src/app/model/game';

@Component({
	selector: 'app-home',
	templateUrl: './home.component.html',
	styleUrls: ['./home.component.css'],
})
export class HomeComponent implements OnInit {
	games: Observable<Game[]>;

	constructor(private service: GameService) {
		this.games = new Observable<Game[]>();
	}

	ngOnInit(): void {
		this.games = this.service.getGames();
		console.log(this.games);
	}
}
