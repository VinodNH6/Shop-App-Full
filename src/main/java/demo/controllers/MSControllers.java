package demo.controllers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpMethod;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import demo.modal.Product;


@RestController
public class MSControllers {
	@Autowired
	RestTemplate restTemplate;
	
	@RequestMapping("/products")
	public List<Product> getProducts() {
    	String url = "http://localhost:8080";
    	Collection<Product> respCollection = (Collection<Product>) restTemplate.exchange( url + "/products2", HttpMethod.GET, null, Object.class).getBody();
    	List<Product> newList = new ArrayList<>(respCollection);
    	System.out.println(newList); 
        return newList;
	}
}
