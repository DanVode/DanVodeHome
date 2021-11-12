package com.company;


public  class Main implements Plant{

    public Plant plant;

    public static void main(String[] args) {
        Nissan nissan = new Nissan();
        nissan.sedan();
        Polo polo = new Polo();
        polo.sUV();
        Tahoe tahoe = new Tahoe();
        tahoe.sedan();
        Hyundai hyundai = new Hyundai();
        hyundai.sUV();
        System.out.println(hyundai);

    }


    @Override
    public void sedan() {

    }

    @Override
    public void sUV() {

    }
}