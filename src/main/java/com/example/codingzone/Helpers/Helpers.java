package com.example.codingzone.Helpers;

import java.util.Scanner;

public class Helpers {

    public static <T> void print(T arg) {
        System.out.println(arg);
    }

    public static String scan() {
        return new Scanner(System.in).nextLine();
    }

    public static String scan(String prompt) {
        System.out.println(prompt);
        return new Scanner(System.in).nextLine();
    }
}
