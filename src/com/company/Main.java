package com.company;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        long num1 = getLong();
        long num2 = getLong();
        char operation = getOperation();
        long result = Counter(num1,num2,operation);
        System.out.println("Результат операции: "+result);
    }

    public static long getLong(){
        System.out.println("Введите число: ");
        long num;
        if(scanner.hasNextInt()){
            num = scanner.nextInt();
        } else {
            System.out.println("Введите число");
            scanner.next();
            num = getLong();
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

    public static long Counter(long num1, long num2, char operation){
        long result;
        switch (operation) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            case '%' -> result = num1 % num2;
            case '^' -> result = num1 ^ num2;
            default -> {
                System.out.println("Такого значения нет.");
                result = Counter(num1, num2, getOperation());
            }
        }
        return result;
    }
}