package com.company;

import java.lang.reflect.Array;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> numbers = new ArrayList<>();
        List<Integer> linkedNumberList = new LinkedList<>();

        System.out.println("Inserte cantidad de numbers a ingresar en enteros");

        int cant = sc.nextInt();

        System.out.println("Inserte sus numbers separados pulsando [ENTER]");

        for (int i = 0; i < cant; i++)
        {
            int n = sc.nextInt();

            linkedNumberList.add(n);
            numbers.add(n);
        }

        System.out.println(numbers);

        System.out.println(order(linkedNumberList));
    }

    public static List<Integer> order(List<Integer> list){

        Collections.sort(list);
        return list;
    }
}
