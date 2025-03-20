package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        List<String> input = new ArrayList<>(Arrays.asList(sc.nextLine().split(" ")));

        int height = Integer.parseInt(input.get(0));
        int width = Integer.parseInt(input.get(1));

        for (int i = 0; i < width; i++) {
            for (int j = 0; j < height; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}