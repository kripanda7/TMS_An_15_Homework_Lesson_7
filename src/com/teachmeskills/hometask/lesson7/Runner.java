package com.teachmeskills.hometask.lesson7;

import com.teachmeskills.hometask.lesson7.model.Phone;

public class Runner {

    public static void main(String[] args) {
        Phone phone1 = new Phone("+375171234567", "Samsung", 170);
        Phone phone2 = new Phone("+375179876543", "HTC", 195);
        Phone phone3 = new Phone("+9912344233", "iPhone", 187);

        System.out.println("Phone 1: " + phone1);
        System.out.println("Phone 2: " + phone2);
        System.out.println("Phone 3: " + phone3);

        phone1.receiveCall("Alex");
        phone2.receiveCall("John");
        phone3.receiveCall("Nick");

        System.out.println(phone1.getNumber());
        System.out.println(phone2.getNumber());
        System.out.println(phone3.getNumber());

        phone1.receiveCall("Alex", "+375292346895");
        phone2.receiveCall("John", "+375299138428");
        phone3.receiveCall("Nick", "+375334959283");

        phone1.sendMessage("+375292346895", "+375299138428", "+375334959283");
    }

}
