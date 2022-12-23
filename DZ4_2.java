package org.example;

import java.util.LinkedList;
import java.util.Scanner;

public class DZ4_2 {
    public static void main(String[] args) {
        LinkedList<Integer> my_list = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число послдовательности: ");
        int number1 = scanner.nextInt();
        my_list.add(number1);
        System.out.println("Введите второе число послдовательности: ");
        int number2 = scanner.nextInt();

        while (number2 != 0){
            int number3 = number1*number2;
            if (number3 < 0){
                System.out.println("Последовательность знакочередующаяся. \nВведите следующее число последовательности");
                number1 = number2;
                number2 = scanner.nextInt();
                my_list.add(number1);
            }
            else{
                System.out.println("Последовательность перестала быть знакочередующейся. \nПолучена последовательность:\n");
                for (int i = 0; i < my_list.size(); i++) {
                    System.out.println(my_list.get(i));
                }
                break;
            }
        }
    }
}
