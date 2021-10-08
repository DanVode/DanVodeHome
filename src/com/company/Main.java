package com.company;

public class Main {
    public static void main(String[] args) {

        System.out.println(fuctorial(8));

    }

    public static int fuctorial(int a){

        if (a == 1) {
            return 1;
        }

        return a*fuctorial(a-1);
    }
}
