package pl.astro.InstrukcjeWarunkowe;

import java.util.Scanner;

public class Zad2 {
Scanner sc = new Scanner (System.in);
int number ;


    public void init() {

        System.out.println("Podaj liczbe");
        number = sc.nextInt();
        if (number%3 ==0)
        {
            System.out.println(" Liczba podzielna przez 3");

        }
        else {
            System.out.println("Liczba nie podzielna przez 3");
        }

    }
}


//Zadanie 2
//Napisz program, który sprawdza czy dana wprowadzona liczba jest podzielna przez 3.