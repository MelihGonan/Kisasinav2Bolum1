public class Main {
    public static void main(String[] args) {

    Daire daire1=new Daire("BilmemNe",1,5);
    Daire daire2=new Daire("BilmemKim",1,3);
    daire1.displayInfo();
    daire2.displayInfo();

    if(daire1.compareTo(daire2)>0){
        System.out.println(daire1.getApartmentNumber()+" büyüktür "+daire2.getApartmentNumber());
    }
    else if(daire1.compareTo(daire2)==0){
        System.out.println("daireler aynıdır.");
    }
    else{
        System.out.println(daire2.getApartmentNumber()+" büyüktür "+daire1.getApartmentNumber());
    }

    System.out.println("------------------------------");

    Bina bina=new Bina("soksokBina",5);
    bina.displayInfo();

    System.out.println("------------------------------");

    EvSahibi evSahibi=new EvSahibi("Berat","Yüce",bina);
    evSahibi.addApartment(daire2);
    evSahibi.displayInfo();

    System.out.println("------------------------------");


    Kiraci kiraci=new Kiraci("Necmi","Güven",evSahibi);
    kiraci.displayInfo();

    }
}
