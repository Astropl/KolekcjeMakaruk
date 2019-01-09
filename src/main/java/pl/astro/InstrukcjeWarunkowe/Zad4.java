package pl.astro.InstrukcjeWarunkowe;

import java.util.Scanner;

public class Zad4 {

    Scanner sc = new Scanner(System.in);
    String word;

    public void init() {
        System.out.println("Podaj imie :");
        word = sc.next();
        int wordLastchart = word.length();
        if ( //word.indexOf(wordLastchart) = "a")
                (word.charAt(wordLastchart-1) == 'a')) {
            System.out.println("Imie zeńskie");
        } else {
            System.out.println("imie meskie");
        }


    }
}

//Zadanie 4
//Napisz program, który odczytuje wyraz i sprawdza czy wprowadzone imię jest męskie czy żeńskie.