package com.desafio.dio;

import java.io.IOException;
import java.util.Locale;
import java.util.Scanner;

public class SomaImpares {

    public static void main(String[] args)  throws IOException {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        int soma = 0;

        if (x > y) {
            for (int i = x-1; i > y; i--) {
                if (i % 2 != 0) {
                    soma += i;
                }
            }
        } else {
            for (int i = x+1; i < y; i++) {
                if (i % 2 != 0) {
                    soma += i;
                }
            }
        }

        System.out.println(soma);
    }


}
