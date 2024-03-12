package com.scaler.vinay.sstmid1.services;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import com.scaler.vinay.sstmid1.dto.fakestore;

@Service
public class ServiceCart {
    RestTemplate restTemplate = new RestTemplate();
    String url = "https://fakestoreapi.com/";

    public fakestore[] getAllCartItems() {
        fakestore[] response = restTemplate.getForObject(url + "carts", fakestore[].class);
        return response;
    }
    public fakestore getCartItem(Long id) {
        fakestore response = restTemplate.getForObject(url + "carts/" + id, fakestore.class);
        return response;
    }
    public fakestore getCartByUser(Long id) {
        fakestore response = restTemplate.getForObject(url + "carts/user/" + id, fakestore.class);
        return response;
    }
    public fakestore[] getCartsInRange(String startDate, String endDate) {
        fakestore[] response = restTemplate.getForObject(url + "carts?startdate=" + startDate + "&enddate=" + endDate, fakestore[].class);
        return response;
    }



    public fakestore updateCartItem(fakestore cart) {

        fakestore fetchCart = new fakestore();
        fetchCart.setId(cart.getId());
        fetchCart.setUserId(cart.getUserId());
        fetchCart.setDate(cart.getDate());
        fetchCart.setProducts(cart.getProducts());
        fetchCart.setM(cart.getM());

        fakestore response = restTemplate.patchForObject(url + "carts/" + cart.getId(), fetchCart, fakestore.class);
        return response;

    }

    public fakestore AddCartItem(fakestore cart){
        fakestore fetchCart = new fakestore();
        fetchCart.setId(cart.getId());
        fetchCart.setUserId(cart.getUserId());
        fetchCart.setDate(cart.getDate());
        fetchCart.setProducts(cart.getProducts());
        fetchCart.setM(cart.getM());

        fakestore response = restTemplate.postForObject(url + "carts/", fetchCart, fakestore.class);
        return response;
    }


    public void deleteCartItem(Long id){
        restTemplate.delete(url + "carts/" + id);
    }




}
