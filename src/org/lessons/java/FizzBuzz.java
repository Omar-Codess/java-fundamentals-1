package org.lessons.java;

import java.util.Arrays;
public class FizzBuzz {
    public static void main(String[] args) {

        int i = 0;
        String[] cpuNumbers = new String[i];

        do {
            if (i != 0 && i % 3 == 0){
                System.out.println("Fizz");
            } else if (i != 0 && i % 5 == 0){
                System.out.println("Buzz");
            }
            System.out.println(i);
            if (i != 0 && i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz");
            }

            i++;
        } while (i < 101);
    }

}

