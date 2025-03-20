package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int j = n, k = 0; j > 0; j--, k++) {
            System.out.print(" ".repeat(k));
            for (int i = n; i > 0; i--) {
                System.out.print(i + " ");
            }
            n--;
            System.out.println(" ");
        }

    }
}