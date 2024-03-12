package com.scaler.vinay.sstmid1.Controller;

import com.scaler.vinay.sstmid1.dto.fakestore;
import com.scaler.vinay.sstmid1.services.ServiceCart;
import com.scaler.vinay.sstmid1.dto.fakestore;
import com.scaler.vinay.sstmid1.services.ServiceCart;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {
    ServiceCart CartService;
    public Controller(ServiceCart CartService) {
        this.CartService = CartService;
    }
    @GetMapping("/carts/")
    public fakestore[] getAllCartItems(){
        return CartService.getAllCartItems();
    }
    @GetMapping("/carts/user/{id}/")
    public fakestore getCartByUser(@PathVariable Long id){
        return CartService.getCartItem(id);
    }

    @GetMapping("/carts/{id}/")
    public fakestore getCartItem(@PathVariable Long id){
        return CartService.getCartItem(id);
    }


    @GetMapping("/carts/range/")
    public fakestore[] getCartsInRange(@RequestParam("startdate") String startDate, @RequestParam("enddate") String endDate){
        return CartService.getCartsInRange(startDate, endDate);
    }
    @GetMapping("/carts/Add/")
    public fakestore AddCartItem(@RequestBody fakestore cart){
        return CartService.AddCartItem(cart);
    }


    @PutMapping("/carts/update/{id}/")
    public fakestore updateCartItem(@RequestBody fakestore cart){
        return CartService.updateCartItem(cart);
    }
    @DeleteMapping("/carts/delete/{id}/")
    public String deleteCartItem(@PathVariable Long id){
        CartService.deleteCartItem(id);
        return "Product is deleted from your cart";
    }
}
