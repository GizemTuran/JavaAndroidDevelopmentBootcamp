package com.example.homework22.odev2;

public class Odev2 {
    public Integer soru1icaci(int kenarsayisi){
        return ((kenarsayisi-2)*180)/kenarsayisi;
    }
    public Double soru2maashesaplama(int gun){

        double saatlikUcret = 40;
        double mesaiUcreti = 80;
        int gunlukCalismaSaati = 8;

        double gunlukUcret = saatlikUcret * gunlukCalismaSaati; //320
        double aylikUcret = gun * gunlukUcret;

        if(gunlukCalismaSaati*gun>150){
            int mesai = (gunlukCalismaSaati*gun)-150;
            mesaiUcreti = (mesaiUcreti - saatlikUcret) * mesai;
            aylikUcret = aylikUcret + mesaiUcreti;
            return aylikUcret;
        }
        else {
            return aylikUcret;
        }
    }
    public Double soru3otoparkucretihesaplama(int sure){
        double saatlikUcret = 50;
        double gecikmeUcreti = 10;
        if(sure > 1){
            for (int i=1;i<sure;i++) {
                saatlikUcret = saatlikUcret + gecikmeUcreti;
            }
            return saatlikUcret;
        }
        else {
            return saatlikUcret;
        }
    }
    public Double soru1kilometremil(int km){
        double mile = km * 0.621;
        return mile;
    }
    public void soru2dikdortgenalani(int kenar1, int kenar2){
        int alan = kenar1 * kenar2;
        System.out.println(alan);
    }
    public int soru3faktoriyel(int sayi){
        int count = 1;
        for (int i = 2; i <= sayi; i++){
            count*=i;
        }
        return count;
    }
    public void soru4eharfhesaplama(String str){
        int count=0;
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)=='e' || str.charAt(i)=='E'){
                count++;
            }
        }
        System.out.println("Sözcükte "+count+" tane e harfi vardır.");
    }
}
