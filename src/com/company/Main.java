package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(answerGoToStreet(20, 23));
        System.out.println(answerGoToStreet(36, -11));
        System.out.println(answerGoToStreet(65, -10));
        System.out.println(answerGoToStreet(74, 72));
        System.out.println(answerGoToStreet(38, -21));
        System.out.println(answerGoToStreet(generateRandomAge(), -29));
        System.out.println(generateRandomAge());

    }

    public static String answerGoToStreet(int age, int temperature) {
        if (age < 20 && temperature >= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age <= 45 && temperature >= -20 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (temperature >= -10 && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайтесь дома";
        }
    }

    public static int generateRandomAge() {
        return (int) (Math.random() * 99);
    }



}




