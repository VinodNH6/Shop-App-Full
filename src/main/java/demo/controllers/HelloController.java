package demo.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import demo.shoppingApp.Product;
import demo.shoppingApp.RestUI;

@RestController
public class HelloController {

	Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	RestUI restUI = new RestUI();
	
	public HelloController() {

	}
	
	
    @RequestMapping(value = "/index")
    public String index() {
       return "index";
    }
	  
	@RequestMapping("/restInfo")
	public String restInfo() {
		return "Available actions: 1. /products1 "
									+ "2. /cart1 "
									+ "3. /addtocart1 "
									+ "4. /remvoefromcart1 ";
	}
	
	
	@RequestMapping("/products1")
	public List<Product> getProducts() {
		return restUI.getProducts();
	}
	
	@RequestMapping("/cart1")
	public List<Product> getCartItems() {
		return restUI.getCartItems();
	}
	
	@RequestMapping("/addtocart1")
	public String addToCart() {
		restUI.addProductToCart(1);
		return "Success";
	}
	
	@RequestMapping("/removefromcart1")
	public String removeFromCart() {
		restUI.removeProductFromCart(1);
		return "Success";
	}
	

}
