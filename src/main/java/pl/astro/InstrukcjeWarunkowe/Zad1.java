package pl.astro.InstrukcjeWarunkowe;

import java.util.Scanner;

public class Zad1 {


    Scanner sc = new Scanner(System.in);
    int number;

    public void init() {
        //zad1a();
//        Zad2 zad2 = new Zad2();
//        zad2.init();
//
//        Zad3 zad3 = new Zad3();
//        zad3.init();
        Zad4 zad4 = new Zad4();
        zad4.init();



    }

    public void zad1a() {
        System.out.println(" Podaj liczbe");
        number = sc.nextInt();

        if (number < 5) {
            System.out.println("Twoja liczba jest mniejsza niz 5");


        } else if (number > 5) {
            System.out.println("Twoja liczba jest wieksza od 5");

        } else {
            System.out.println("Twoja liczba jest równa 5");
        }
    }
}


//Zadanie 1
//Napisz program, który sprawdzi czy wprowadzona liczba jest większa od 5.