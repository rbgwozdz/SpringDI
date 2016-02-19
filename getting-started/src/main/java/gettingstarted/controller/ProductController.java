package gettingstarted.controller;

import org.springframework.stereotype.Controller;

import gettingstarted.domain.Product;

@Controller
public class ProductController {
	
	public Product get(Long id){
		Product product = new Product();
		product.setDescription("Spring Guru in Action");
		return product;	
	}

}
