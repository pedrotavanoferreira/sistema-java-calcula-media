package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite a nota P1:");
        double p1 = entrada.nextDouble();
        System.out.println("Digite a nota P2:");
        double p2 = entrada.nextDouble();
        double media = (p1 + p2) / 2;
        System.out.println("A sua média é:" + media);
    }
}