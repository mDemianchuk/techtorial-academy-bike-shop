package com.techtorial.academy.models;

public abstract class Bike {
    private int price;
    private String kind;

    public int getPrice() {
        return this.price;
    }

    public String getKind() {
        return this.kind;
    }

    protected void setPrice(int price) {
        this.price = price;
    }

    protected void setKind(String kind) {
        this.kind = kind;
    }

    @Override
    public String toString() {
        return this.kind + " bike for $" + this.price;
    }
}
