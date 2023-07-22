package org.shiba.palmoilapi.orderjpa;

public class OrderNotFoundException extends Throwable{
    public OrderNotFoundException() {
    }

    public OrderNotFoundException(String message) {
        super(message);
    }
}
