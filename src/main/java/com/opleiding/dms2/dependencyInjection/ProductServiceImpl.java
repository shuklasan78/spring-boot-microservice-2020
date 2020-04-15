package com.opleiding.dms2.dependencyInjection;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class ProductServiceImpl implements ProductService {

    @Override
    public List<Product> listProducts() {
        ArrayList<Product> products = new ArrayList<Product>(2);
        products.add(new Product("Product 1 description"));
        products.add(new Product("Product 2 description"));
        return products;
        
        //Ideally, when you are coding for Dependency Injection, you will
        //want to code to an interface. This will allow you easily utilize polymorphism 
        //and implement different concrete implementations. When coding for the use of dependency injection, 
        //coding to an interface also complies with the Interface Segregation Principle of the SOLID principles of Object Oriented Programming.
    }
}