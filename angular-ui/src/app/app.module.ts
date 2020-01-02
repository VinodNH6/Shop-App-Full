import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import {ShopComponent} from './shopping.app/shop.component';
import {ProductsComponent} from './shopping.app/products.component';
import {CartComponent} from './shopping.app/cart.component';

import {ShopService} from './shopping.app/service/shop.service';


@NgModule({
  declarations: [
    AppComponent,

    ShopComponent,
    ProductsComponent,
    CartComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [ShopService],
  bootstrap: [  
      AppComponent
    ]
})
export class AppModule { }
