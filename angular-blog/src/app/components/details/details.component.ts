import { Component, Input } from '@angular/core';

@Component({
  selector: 'app-details',
  templateUrl: './details.component.html',
  styleUrls: ['./details.component.css'],
})
export class DetailsComponent {
  @Input()
  photo: string = '';

  @Input()
  title: string = '';

  @Input()
  description: string = '';

  @Input()
  id: string = '0';
}
