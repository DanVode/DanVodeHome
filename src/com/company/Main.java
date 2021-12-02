package com.company;

class Car {}
class Main {

    public static void main(String[] args) {
        Object mers = new Mersedes();
        Object porsh = new Porsh();
        if ( mers instanceof Vehicle ) {
            System.out.println("Мерседес имплеметирует класс Движения");
        }
        if ( porsh instanceof Vehicle ) {
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