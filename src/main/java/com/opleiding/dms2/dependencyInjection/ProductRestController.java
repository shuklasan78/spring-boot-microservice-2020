package com.opleiding.dms2.dependencyInjection;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
public class ProductRestController {
	
	private ProductService productService;

    @Autowired
    public void setProductService(ProductService productService) {
        this.productService = productService;
    }
    
	@GetMapping("di/products")	
	public List<Product>  getProduct()
	{
		log.info("This is info");
		log.debug("This is debug");
		return productService.listProducts();
	}

}
