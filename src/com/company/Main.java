package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int num1 = getInt();
        int num2 = getInt();
        char operation = getOperation();
        int result = test2(num1,num2,operation);
        System.out.println("Результат операции: "+result);
    }

    public static int getInt(){
        System.out.println("Введите число: ");
        int num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Введите число");
            scanner.next();
            num = getInt();
        }
        return num;
    }

    public static char getOperation(){
        System.out.println("Введите операцию: ");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Попробуйте +, -, /, % или *");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static int test2(int num1, int num2, char operation){
        int result;
        switch (operation) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            case '%' -> result = num1 % num2;
            default -> {
                System.out.println("Такого значения нет.");
                result = test2(num1, num2, getOperation());
            }
        }
        return result;
    }
}