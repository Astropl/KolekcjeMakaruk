package pl.astro.InstrukcjeWarunkowe;

import java.util.Scanner;

public class Zad3 {
    Scanner sc = new Scanner(System.in);
    String word;

    public void init()
    {
        System.out.println("Wpisz jakis wyraz");
        word = sc.next();
        if ( word.equals( "Akademia"))
        {
            System.out.println("Twoje słowo to Akademnia");

        }
        else
        {
            System.out.println("Twj wyraz to nie Akademia\nTylko "+ word);
        }


    }
}
//Zadanie 3
//Napisz program, który odczytuje wyraz i sprawdza czy wprowadzony wyraz to Akademia.