package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import demo.shoppingApp.RestUI;
import demo.shoppingApp.StartUI;

@SpringBootApplication
public class HelloWorld {
	public static void main(String[] args) {
		SpringApplication.run(HelloWorld.class, args);
	}
	
	  @Bean
	  public RestTemplate getRestTemplate() {
	      return new RestTemplate();
	  }
}
