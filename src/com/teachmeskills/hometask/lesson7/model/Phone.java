package com.teachmeskills.hometask.lesson7.model;

import java.util.Arrays;

public class Phone {

    private String number;
    private String model;
    private int weight;

    public Phone(String number, String model, int weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    public Phone(String number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone() {
    }

    public void receiveCall(String caller) {
        System.out.println(caller + " is calling.");
    }

    public void receiveCall(String caller, String callerNumber) {
        System.out.println(caller + " is calling from " + callerNumber);
    }

    public String getNumber() {
        return number;
    }

    public void sendMessage(String... numbers) {
        System.out.println("Phone numbers for sending message: " + Arrays.toString(numbers));
    }

    @Override
    public String toString() {
        return "Phone{" +
                "number='" + number + '\'' +
                ", model='" + model + '\'' +
                ", weight=" + weight +
                '}';
    }
}
