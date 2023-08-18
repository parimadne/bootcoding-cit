package src.java;

import java.util.Scanner;

public class IfElseEx1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int x = sc.nextInt();
        System.out.println("Enter second Number:");
        int y = sc.nextInt();
        if (x == y) {
            System.out.println("Number are same!");
        } else {
            System.out.println("Numbers are different!");
        }
    }


}

