package com.company;

class MyThread implements Runnable {

    public void run(){

        System.out.printf("%s начатый \n", Thread.currentThread().getName());
        int counter=1;
        while(!Thread.currentThread().isInterrupted()){

            System.out.println("Loop " + counter++);
        }
        System.out.printf("%s законченный \n", Thread.currentThread().getName());
    }
}
class Program {

    public static void main(String[] args) {

        System.out.println("Основной поток начат");
        MyThread myThread = new MyThread();
        Thread t = new Thread(myThread,"MyThread");
        t.start();
        try{
            Thread.sleep(150);
            t.interrupt();

            Thread.sleep(150);
        }
        catch(InterruptedException e){
            System.out.println("Тема была прервана");
        }
        System.out.println("Основной поток завершен");
    }
}
