package com.jpard.shop;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by flaviu.lupoian on 08/06/2017.
 */
public class Cart implements Serializable{
    private Price totalInitialPrice;
    private Price finalPrice;
    private Price discountValue;
    private ArrayList<Product> cartProducts = new ArrayList<>();
    private ArrayList<Bag> cartBags = new ArrayList<>();

    public Cart() {
        this.discountValue = new Price(0);
        this.finalPrice = new Price(0);
        this.totalInitialPrice = new Price(0);
    }

    public void addProduct(Product product) {
        cartProducts.add(product);
    }

    public void addBag(Bag bag) {
        cartBags.add(bag);
    }

    private double calculateBagsInitialPrice() {
        double bagsInitialPrice = 0;
        for (Bag bag : cartBags) {
            bagsInitialPrice += bag.getTotalInitialPrice().getValue();
        }

        return bagsInitialPrice;
    }

    private double calculateProductsInitialPrice() {
        double productsInitialPrice = 0;
        for (Product product : cartProducts) {
            productsInitialPrice += product.getPrice().getValue();
        }

        return productsInitialPrice;
    }

    /**
     * Makes all calculations and sets the required fields.
     */
    public void calculate() {
        for (Bag bag : cartBags) {
            bag.calculate();
        }
        calculateDiscount();
        totalInitialPrice = new Price(calculateProductsInitialPrice() + calculateBagsInitialPrice());
        finalPrice = new Price(totalInitialPrice.getValue() - discountValue.getValue());
    }

    private void calculateDiscount() {
        double discount = 0;

        for (Bag bag : cartBags) {
            bag.calculate();
            discount += bag.getDiscountValue().getValue();
        }

        this.discountValue.setValue(discount);
    }

    @Override
    public String toString() {
        return "Shopping Cart{" + "Initial Price: " + totalInitialPrice.getFormattedValue() + ", Final Price: " + finalPrice.getFormattedValue() + '}';
    }

    public ArrayList<Product> getCartProducts() {
        return cartProducts;
    }

    public ArrayList<Bag> getCartBags() {
        return cartBags;
    }

    public Price getTotalInitialPrice() {
        return totalInitialPrice;
    }

    public Price getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(Price discountValue) {
        this.discountValue = discountValue;
    }

    public Price getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(Price finalPrice) {
        this.finalPrice = finalPrice;
    }
}


