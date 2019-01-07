package pl.astro;

import java.util.Scanner;

public class ZadDod1 {
    int max, i, sum = 0;
    Scanner sc = new Scanner(System.in);

    public void init() {
        System.out.println("Start");
        initSumFirst();
        initSumSecond();
    }

    public void initSumFirst() {
        System.out.println("Podaj liczbę do jakiej mam liczyc");
        max = sc.nextInt();
        for (i = 1; i <= max; i++) {
            sum = sum + i;
        }
        System.out.println("Suma to " + sum);
    }

    public void initSumSecond() {
        long max =0; long sum = 0; long i=0;
        System.out.println("Podaj liczbę do jakiej mam liczyc");
        long max1 = 1000 * 1000 * 1000;
        max = max1;
        for (i = 1; i <= max; i++) {
            sum = sum + i;
        }
        System.out.println("Suma to " + sum);
    }
}


//napisz program, który sumuje liczby od 1 do n. n podane jest przez użytkownika.
//Akademia Kodu​1+2+3+4+5=15
//Akademia Kodu​Poziom łatwy program ma działać dla n<=46340.
//Akademia Kodu​Poziom średni program ma działać dla n<=1000*1000*1000
//Akademia Kodu​Poziom trudny program dla n = 1000*1000*1000 ma wykonywać się poniżej 1 sekundy.