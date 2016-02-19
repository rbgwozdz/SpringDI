package gettingstarted;

import gettingstarted.controller.ProductController;
import gettingstarted.domain.Product;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class GettingStartedApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(GettingStartedApplication.class, args);
		ProductController controller = (ProductController) ctx.getBean("productController");
		
		Product product = controller.get(1L);
		System.out.println("Result of controller action: ");
		System.out.println(product.getDescription());
	}
}
