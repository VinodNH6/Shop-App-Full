import { Component } from '@angular/core';

@Component({
  selector: 'shop-cart',
  template: `
    <h1>Cart</h1>
    <div>
        <div *ngFor="let product of cartItems">
           <p> {{product.name}} </p>
        </div>
    </div>
  `
})
export class CartComponent {
  title = 'angular-ui';

  cartItems: any =   [{"id": 1, "name": "Hyundai", "price": 10, "stock": 10}];

}
