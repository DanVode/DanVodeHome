package com.company;

import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

    static Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        double num1 = getLong();
        double num2 = getLong();
        char operation = getOperation();
        double result = Counter(num1,num2,operation);
        System.out.println("Результат операции: "+result);
    }

    public static double getLong(){
        System.out.println("Введите число: ");
        double num;
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

    public static double Counter(double num1, double num2, char operation){
        double result;
        switch (operation) {
            case '+' -> result = num1 + num2;
            case '-' -> result = num1 - num2;
            case '*' -> result = num1 * num2;
            case '/' -> result = num1 / num2;
            case '%' -> result = num1 % num2;
            default -> {
                System.out.println("Такого значения нет.");
                result = Counter(num1, num2, getOperation());
            }
        }
        return result;
    }
}