package org.example.warmup;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class WarmUpApplication {

    public static void main(String[] args)
    {
    
        Product product = new Product("Laptop", -1000.0, -5);
        
        System.out.println(product.getPrice());
        System.out.println(product.getStock());
        
    }

}
