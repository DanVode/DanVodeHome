package com.company;

import java.util.ArrayList;
import java.util.List;

class Car {}
class Main {

    public static void main(String[] args) {

        List list = new ArrayList();
        Auto mers = new Mercedess();
        Auto porsh = new Porsh();
        if ( mers instanceof Auto) {
            System.out.println("Мерседес имплеметирует класс Движения");
        }
        if ( porsh instanceof Auto) {
            System.out.println("Порш имплеметирует класс Движения");
        }
        if ( mers instanceof  Car ) {
            System.out.println("Мерседес это машина");
        }
        if ( porsh instanceof  Car ) {
            System.out.println("Порш это машина");
        }
    }
}