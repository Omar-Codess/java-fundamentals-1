package org.lessons.java;

import java.util.Scanner;

public class TrainTicket {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Inserisci la tua età:");
        int userAge = Integer.parseInt(scan.nextLine());

        System.out.print("Inserisci il numero di kilometri che devi percorrere:");
        int userKm = Integer.parseInt(scan.nextLine());

        double totalPrice = userKm * 0.21;

        if (userAge > 17 && userAge < 65){
            System.out.print("Il prezzo è: " + totalPrice);
        }

        if (userAge < 18){
            double totalPriceDiscounted = totalPrice * 0.8;
            System.out.print("Dato che sei minorenne il prezzo scontato del 20% è: " + totalPriceDiscounted);
        }

        if(userAge > 65){
            double totalPriceDiscounted = totalPrice * 0.6;
            System.out.print("Dato che sei over65 il prezzo scontato del 40% è: " + totalPriceDiscounted);
        }
    }
}
