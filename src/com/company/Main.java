
/*
 *  UCF COP3330 Fall 2021 Exercise 35 Solution
 *  Copyright 2021 Timothy Azinord
 */

package com.company;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        String str1;
        ArrayList<String> names = new ArrayList<String>();
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        do {
            System.out.print("Enter a name : ");
            str1 = s.nextLine();
            names.add(str1);
        }while(!str1.isEmpty());
        names.remove(names.size() - 1);
        System.out.println("The winner is " + names.get(r.nextInt(names.size())));
    }
}