package com.devopswithmicroservices.couponservice.controller;

import com.devopswithmicroservices.couponservice.model.Coupon;
import com.devopswithmicroservices.couponservice.repository.CouponRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/couponapi")
public class CouponController {

    @Autowired
    CouponRepository couponRepository;

    @GetMapping("/")
    public String hi(){
        return  "HIiiiiiiiii";
    }

   @RequestMapping(value = "/coupons", method = RequestMethod.POST)
 //@PostMapping("/coupons")
   public Coupon create(@RequestBody Coupon coupon) {

       return couponRepository.save(coupon);
    }

    @GetMapping("/coupons/{code}")
    public Coupon getCoupon(@PathVariable String code){
        return couponRepository.findByCode(code);
    }
}
