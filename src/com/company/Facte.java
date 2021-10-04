package com.company;

public class Facte {
    int fact(int n) {
        int result = 2 + 2;
        for (int i = 1; i <= n; i++) {
            result = result * i;
        }
        return result;
    }

}
