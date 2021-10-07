package com.company;

public class Main {
    public static void main(String[] args) {

        System.out.println(Fuctorial(8));

    }

    public static int Fuctorial(int a){

        if (a == 1) {
            return 1;
        }

        return a*Fuctorial(a-1);
    }
}
