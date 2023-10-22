package com.devopswithmicroservices.productservice.controller;

import com.devopswithmicroservices.productservice.dto.Coupon;
import com.devopswithmicroservices.productservice.model.Product;
import com.devopswithmicroservices.productservice.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/productapi")
public class ProductController {

    @Autowired
   private ProductRepository productRepository;

    @Value("${couponService.url}")
    private String couponServiceURL;
    @Autowired
    private RestTemplate restTemplate;
   // @PostMapping("/products")
    @RequestMapping(value = "/products", method = RequestMethod.POST)
    public Product create(@RequestBody Product product){
      Coupon coupon =   restTemplate.getForObject(couponServiceURL+product.getCouponCode(), Coupon.class);
      product.setPrice(product.getPrice().subtract(coupon.getDiscount()));
        return productRepository.save(product);
    }

    @GetMapping("/")
    public String getData(){
        return "Hiii";
    }
}
