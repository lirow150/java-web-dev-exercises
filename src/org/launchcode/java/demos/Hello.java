package org.launchcode.java.demos;

/**
 * From "Java Web Development"
 */

import java.util.Scanner;
public class Hello {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("What is your name");
        String answer = input.nextLine();
        System.out.println("My name is " + answer);


    }
}
