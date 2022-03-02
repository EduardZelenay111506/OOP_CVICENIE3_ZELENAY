package sk.stuba.fei.uim.oop;
import sk.stuba.fei.uim.oop.auto.Auto;
public class Main {
    public static void main(String[] args) {
        Auto skoda = new Auto();
        Auto bmw = new Auto();

        skoda.jedna = 1;
        bmw.jedna = 2;
        skoda.setStavNadrze(100);
        skoda.setKapacitaNadrze(100);
        System.out.println(skoda.stav());
        skoda.jazdi(100);
        System.out.println(skoda.stav());

        if (skoda.jedna == bmw.jedna) {
            System.out.println("rovnake");
        } else {
            System.out.println("rozne");
        }
    }
}