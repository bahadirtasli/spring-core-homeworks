package org.example.menu;

import org.example.classes.Class1;
import org.example.classes.Class2;

import java.util.Scanner;

/**
 * @author Bahadir Tasli
 * @Date 2/21/2023
 */
public class Menu {
    static Scanner scanner = new Scanner(System.in);

    public static void chooseClass() {
        System.out.println("Choose your class for learn your letter grade");
        System.out.println("1. Class 1");
        System.out.println("2. Class 2");

        System.out.println();

        int option;
        option = scanner.nextInt();
        switch (option) {
            case 1 :
                Class1();
                break;
            case 2 :
                Class2();
                break;
            default:
                System.out.println("Invalid class");
                chooseClass();
                break;
        }

    }

    private static void Class1() {

    }

    private static void Class2() {

    }
}
