package com.jpard.shop;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by flaviu.lupoian on 08/06/2017.
 */
public class Bag implements Serializable {
    private int name;
    private Price initialPriceForProductsinABag;
    private Price initialPriceForBagsinABag;
    private Price totalInitialPrice;
    private Price finalPrice;
    private Price discountValue;
    private ArrayList<Product> productsInBag = new ArrayList<>();
    private ArrayList<Bag> bagsInBag = new ArrayList<>();

    public Bag() {
        this.initialPriceForProductsinABag = new Price(0);
        this.totalInitialPrice = new Price(0);
        this.discountValue = new Price(0);
        this.initialPriceForBagsinABag = new Price(0);
        this.finalPrice = new Price(0);
    }

    public void addProducts(Product product) {
        productsInBag.add(product);
    }

    public void addBags(Bag bag) {
        bagsInBag.add(bag);
    }

    /**
     * Makes all calculations and sets the required fields.
     */
    public void calculate() {
        calculateInitialPriceForProductsInBag();
        calculateInitialPriceforBagsInBag();
        calculateTotalInitialPrice();

        calculateDiscountForBag();
        calculateDiscountForBagsInBag();
        calculateFinalPrice();
    }


    private void calculateInitialPriceForProductsInBag() {
        double initialVariable = 0;

        for (Product product : productsInBag) {
            initialVariable += product.getPrice().getValue();
        }

        initialPriceForProductsinABag = new Price(initialVariable);
    }

    private void calculateInitialPriceforBagsInBag() {
        double totalVariable = 0;

        for (Bag bag : bagsInBag) {
            bag.calculate();
            totalVariable += bag.getInitialPriceForProductsinABag().getValue();
        }

        initialPriceForBagsinABag.setValue(totalVariable);
    }

    private void calculateTotalInitialPrice() {
        double totalVariable = 0;
        totalVariable += getInitialPriceForProductsinABag().getValue() + getInitialPriceForBagsinABag().getValue();

        totalInitialPrice = new Price(totalVariable);
    }

    @Override
    public String toString() {

        StringBuilder bagString = new StringBuilder();
        bagString.append("\nBag ").append(name).append(" Initial price: ").append(getTotalInitialPrice().getFormattedValue()).append(" Final Price: ")
                .append(getFinalPrice().getValue()).append(" contents: ").append("\n").append(productsInBag).append("\n");

        for (Bag bag : bagsInBag) {
            bagString.append(bag.toString());
        }

        return bagString.toString();
    }

    private void calculateDiscountForBag() {
        double discountValue = 0;
        double discount10Percent = initialPriceForProductsinABag.getValue() / 10;
        double discount5Percent = initialPriceForProductsinABag.getValue() / 5;

        if (getInitialPriceForProductsinABag().getValue() > 1000) {
            discountValue += discount10Percent;
            this.discountValue.setValue(discountValue);
        } else {

            if (getProductsInBag().size() > 5) {
                discountValue += discount5Percent;
                this.discountValue.setValue(discountValue);
            }
        }
    }

    private void calculateDiscountForBagsInBag() {
        double discountValue = 0;
        double discount10Percent = initialPriceForProductsinABag.getValue() / 10;
        double discount5Percent = initialPriceForProductsinABag.getValue() / 5;

        for (Bag bag : bagsInBag) {
            bag.calculateDiscountForBagsInBag();

            if (bag.discountValue.getValue() > 100) {
                bag.calculateDiscountForBag();
                discountValue += discount10Percent;
                this.discountValue.setValue(discountValue);
            } else {
                if (bag.getProductsInBag().size() > 5) {
                    bag.calculateDiscountForBag();
                    discountValue += discount5Percent;
                    this.discountValue.setValue(discountValue);
                }
            }
        }
    }

    private void calculateFinalPrice() {
        finalPrice.setValue(getTotalInitialPrice().getValue() - getDiscountValue().getValue());
    }

    public int getName() {
        return name;
    }

    public void setName(int name) {
        this.name = name;
    }

    public Price getTotalInitialPrice() {
        return totalInitialPrice;
    }

    public Price getInitialPriceForProductsinABag() {
        return initialPriceForProductsinABag;
    }

    public ArrayList<Product> getProductsInBag() {
        return productsInBag;
    }

    public ArrayList<Bag> getBagsInBag() {
        return bagsInBag;
    }

    public Price getDiscountValue() {
        return discountValue;
    }

    public void setDiscountValue(Price discountValue) {
        this.discountValue = discountValue;
    }

    public void setInitialPriceForProductsinABag(Price initialPriceForProductsinABag) {
        this.initialPriceForProductsinABag = initialPriceForProductsinABag;
    }

    public Price getInitialPriceForBagsinABag() {
        return initialPriceForBagsinABag;
    }

    public void setInitialPriceForBagsinABag(Price initialPriceForBagsinABag) {
        this.initialPriceForBagsinABag = initialPriceForBagsinABag;
    }

    public Price getFinalPrice() {
        return finalPrice;
    }

    public void setFinalPrice(Price finalPrice) {
        this.finalPrice = finalPrice;
    }
}
