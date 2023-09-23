import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Game } from '../model/game';

@Injectable({
	providedIn: 'root',
})
export class GameService {
	constructor(private httpClient: HttpClient) {}

	public getGames() {
		return this.httpClient.get<Game[]>('assets/data.json');
	}
}
