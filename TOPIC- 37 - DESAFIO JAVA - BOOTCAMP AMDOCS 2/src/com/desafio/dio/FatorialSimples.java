package com.desafio.dio;

import java.util.Scanner;

public class FatorialSimples {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int N = entrada.nextInt(); // Entrada de dados

        int F = 1;

        if(N < 13 && N > 0) {

            for (int i = 2; i <= N; i++) {
                F *= i;
            }

            System.out.println(F); // Saída esperada

        } else {
            System.out.println(0); // Saída caso não obedeça a regra
        }

    }
}
