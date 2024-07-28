package com.company;

import java.util.Scanner;

import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        float num1 = getFloat();
        float num2 = getFloat();
        char operation = getOperation();
        float result = calc(num1,num2,operation);
        System.out.println("Результат операции: "+result);
    }

    public static float getFloat(){
        System.out.println("Введите число:");
        float num;
        if(scanner.hasNextFloat()){
            num = scanner.nextFloat();
        } else {
            System.out.println("Вы допустили ошибку при вводе числа. Попробуйте еще раз.");
            scanner.next();
            num = getFloat();
        }
        return num;
    }

    public static char getOperation(){
        System.out.println("Введите операцию:");
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        } else {
            System.out.println("Вы допустили ошибку при вводе операции. Попробуйте еще раз.");
            scanner.next();
            operation = getOperation();
        }
        return operation;
    }

    public static float calc(float num1, float num2, char operation){
        float result;
        switch (operation){
            case '+':
                result = num1+num2;
                break;
            case '-':
                result = num1-num2;
                break;
            case '*':
                result = num1*num2;
                break;
            case '/':
                result = num1/num2;
                break;
            case '%':
                result = num1%num2;
                break;
            default:
                System.out.println("Операция не распознана. Повторите ввод.");
                result = calc(num1, num2, getOperation());
        }
        return result;
    }
}
