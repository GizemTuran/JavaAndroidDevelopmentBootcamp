package com.example.homework22.odev2;

public class Odev2Main {
    public static void main(String[] args) {
        Odev2 o = new Odev2();
        System.out.println("Bir iç açı : "+ o.soru1icaci(3));
        System.out.println("İşçinin maaşı : "+ o.soru2maashesaplama(20));
        System.out.println("Otopark ücreti : "+ o.soru3otoparkucretihesaplama(2));
        System.out.println("Kilometreden mile çevirme : "+ o.soru1kilometremil(10));
        System.out.print("Dikdörtgenin alanı : ");
        o.soru2dikdortgenalani(2,3);
        System.out.println("Faktoriyel : "+o.soru3faktoriyel(4));
        o.soru4eharfhesaplama("Ecem");
    }
}
