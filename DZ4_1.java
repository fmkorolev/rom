package org.example;

import java.util.Scanner;
import java.util.Stack;

public class DZ4_1 {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину послдовательности: ");
        int n = scanner.nextInt();
        for (int i = 0; i < n; i++) {
            stack.push(scanner.nextInt());
        }
        for (int i = 0; i < n; i++) {
            System.out.println( stack.pop());
        }
    }
}