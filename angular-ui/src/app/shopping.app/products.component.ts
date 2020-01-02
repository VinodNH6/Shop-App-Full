import { Component } from '@angular/core';
import { ShopService } from './service/shop.service';

@Component({
  selector: 'shop-products',
  template: `
    <h1>Products</h1>
    <button (click)="loadProducts()"> Load Products </button>
    <div>
        <div *ngFor="let product of products">
           <p> {{product.name}} </p>
        </div>
    </div>
  `
})
export class ProductsComponent {
    products: any;

    constructor(private shopService: ShopService) { }

    ngOnInit() {
        this.products = [{"id": 1, "name": "Puma", "price": 10, "stock": 10},
                        {"id": 2, "name": "Sparx", "price": 20, "stock": 20},
                        {"id": 3, "name": "Bata", "price": 30, "stock": 30} ];
    }

    loadProducts() {
        this.shopService.getProducts("products").subscribe(data => {
            this.products = data;
        });
    }


}




