package org.example;


import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(0);
        list.add(1);
        for (int i = 0; i < 10; i++) {
            System.out.print(list.get(0) + " ");
            int a = list.get(0);
            list.set(0, list.get(1) + a);
            list.set(1, a);
        }


    }
}