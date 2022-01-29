package com.desafio.dio;

import java.util.Scanner;

public class FibonacciRapido {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Double n = sc.nextDouble();

        if(n > 0 && n <= 50){

            n = (Math.pow(((1 + Math.sqrt(5))/2), n) - Math.pow(((1 - Math.sqrt(5))/2), n))/Math.sqrt(5);
            System.out.printf("%.1f", n);
        } else {
            System.out.println(0);
        }

    }

}
