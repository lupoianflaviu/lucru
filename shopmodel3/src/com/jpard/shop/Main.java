package com.jpard.shop;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;
import java.util.Random;

/**
 * Shopping Cart Model
 *
 * @author Flaviu Lupoian
 * @version 1.1
 * @since 1.8
 */
public class Main {

    public static void main(String[] args) {

        Cart cart = new Cart();
        Random random = new Random();

        for (int i = 0; i < 9; i++) {
            Product product = new Product(i, new Price((0.1 + (500 - 0.1) * random.nextDouble())));
            cart.addProduct(product);
        }

        Bag bag1 = new Bag();
        bag1.setName(1);
        Bag bag2 = new Bag();
        bag2.setName(2);
        Bag bag3 = new Bag();
        bag3.setName(3);

        for (int i = 9; i < 51; i++) {
            Product product = new Product(i, new Price((0.1 + (500 - 0.1) * random.nextDouble())));
            bag1.addProducts(product);
        }

        for (int i = 51; i < 70; i++) {
            Product product = new Product(i, new Price((0.1 + (500 - 0.1) * random.nextDouble())));
            bag2.addProducts(product);
        }

        for (int i = 70; i < 100; i++) {
            Product product = new Product(i, new Price((0.1 + (500 - 0.1) * random.nextDouble())));
            bag3.addProducts(product);
        }
        //bag1 in cart, bag3 in bag 1, bag 2 in bag 3
        bag1.addBags(bag3);
        bag3.addBags(bag2);
        cart.addBag(bag1);

        cart.calculate();

        System.out.println(cart.toString());
        System.out.println("############################################################################");
        writeToFile("serializationCart.txt", cart);

        System.out.println(Arrays.toString(cart.getCartProducts().toArray()));
        writeToFile("serializationProducts.txt", Arrays.toString(cart.getCartProducts().toArray()));
        System.out.println("############################################################################");

        for (Bag bag : cart.getCartBags()) {
            System.out.println(bag.toString());
            System.out.println("############################################################################");
            writeToFile("serializationBags.txt", bag);
        }

        System.out.println("Reading objects from files: \n");
        readFromFile("serializationCart.txt", cart);
        readFromFile("serializationProducts.txt", cart);

        for (Bag bag : cart.getCartBags()) {
            readFromFile("serializationBags.txt", bag);
        }
    }


    private static void writeToFile(String fileName, Object object) {
        File file = new File(fileName);

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(object);
            oos.flush();
            oos.close();
        } catch (IOException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }

    private static void readFromFile(String fileName, Object object) {
        try (FileInputStream fis = new FileInputStream(fileName); ObjectInputStream ois = new ObjectInputStream(fis)) {

            object = ois.readObject();
            System.out.println(object.toString());
        } catch (IOException | ClassNotFoundException e) {
            System.err.println("IOException: " + e.getMessage());
        }
    }
}