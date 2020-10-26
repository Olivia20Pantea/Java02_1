package com.company;

import java.util.Scanner;

public class Main {
    private static final int pricePerson = 35;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the number of guests: ");
        int numberGuests = scanner.nextInt();
        int totalPrice = numberGuests * pricePerson;
        System.out.println("numberGuests = " + numberGuests);
        System.out.println("pricePerson = " + pricePerson);
        System.out.println("totalPrice = " + totalPrice);
    }
}
