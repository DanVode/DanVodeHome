package com.company.home;

public class Enum{

    public static void main(String[] args) {

        Season b1 = new Season(Type.Summer);
        System.out.println("Июнь, Июль, Август это месяца "+  b1.bookType + ".");
        Season b2 = new Season(Type.Winter);
        System.out.println("Декабрь, Январь, Февраль это месяца " +  b2.bookType + ".");
        Season b3 = new Season(Type.Autumn);
        System.out.println("Сентябрь, Октябрь, Ноябрь это месяца "+  b3.bookType + ".");
        Season b4 = new Season(Type.Spring);
        System.out.println("Март, Апрель, Май это месяца "+  b4.bookType + ".");


    }
}
class Season{

    Type bookType;

    Season(Type type){

        bookType = type;
    }
}

enum Type
{
    Winter,
    Summer,
    Autumn,
    Spring
}
