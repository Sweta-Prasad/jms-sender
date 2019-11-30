package com.example.jmssender.jms;

import java.io.Serializable;
//Serialization - is a mechanism of converting the state of an object into a byte stream.
//Deserialization - is the reverse process where the byte stream is used to recreate the actual java object in memory.
// This mechanism is used to persist the object

public class Product implements Serializable {

    private static final long serialVersionUID = 42L;
    private int productId;
    private String name;
    private int quantity;

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", name='" + name + '\'' +
                ", quantity=" + quantity +
                '}';
    }
}
