import { Component } from '@angular/core';

@Component({
  selector: 'shop-root',
  template: `
    <h1>Angular Router</h1>
        <nav>
            <a routerLink="/products" routerLinkActive="active">Products</a> &nbsp;
            <a routerLink="/cart" routerLinkActive="active">Cart</a>
        </nav>
    <router-outlet></router-outlet>
  `
})
export class ShopComponent {
  title = 'angular-ui';
}
