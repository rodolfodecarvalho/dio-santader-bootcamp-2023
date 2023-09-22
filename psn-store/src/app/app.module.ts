import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { HomeComponent } from './pages/home/home.component';
import { CardComponent } from './components/card/card.component';
import { MenuBarComponent } from './components/menu-bar/menu-bar.component';
import { LabelComponent } from './components/card/label/label.component';
import { PricingComponent } from './components/card/pricing/pricing.component';

@NgModule({
	declarations: [
		AppComponent,
		HomeComponent,
		CardComponent,
		MenuBarComponent,
		LabelComponent,
		PricingComponent,
	],
	imports: [BrowserModule, AppRoutingModule],
	providers: [],
	bootstrap: [AppComponent],
})
export class AppModule {}
