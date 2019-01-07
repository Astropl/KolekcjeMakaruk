package pl.astro;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Zad1 {
    int j, num;

    public void init() {

        System.out.println("Start");

        initColectionFirst();
    }

    public void initColectionFirst() {
        List<Integer> numbers = new ArrayList<>();


        for (int i = 0; i <= 10; i++) {
            numbers.add(i);
        }
        System.out.println(numbers);
        for (j = 0; j <= 10; j++) {
            getDividedByThree(Arrays.asList(j));
            System.out.println(num);
        }

    }

    public List<Integer> getDividedByThree(List<Integer> numbers) {


        for (int num:numbers) {
            if ((num % 3) == 0) {
                return Collections.singletonList(num);
            }

        }
        //numbers = numbers.intValue();\
        //int num = (int) Integer.valueOf(numbers);
//        if ((numbers % 3) == 0) {
//            return numbers;

        return null;

    }
}


//​Zadanie 1
//
//        Napisz metodę, która dla danej listy zwraca nową listę elementów, które są podzielne przez 3.
//
//        List<Integer> getDividedByThree(List<Integer> numbers);
//

