package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        int arr[] = new int[5];
        int even = 0;
        int notEven = 0;
        int arrEven[], arrNotEven[];
        Random random = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100) + 1;
            if(arr[i] % 2 == 0) even++;
            else notEven++;
            if (i == 0) System.out.print("Весь массив: ");
            System.out.printf("%d ", arr[i]);
        }
        System.out.println();
        arrEven = new int[even];
        arrNotEven = new int[notEven];
        even = 0;
        notEven = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                arrEven[even] = arr[i];
                even++;
            }else {
                arrNotEven[notEven] = arr[i];
                notEven++;
            }
        }
        even = 0;
        notEven = 0;
        for (int i = 0; i < arrEven.length; i++){
            if (i == 0) System.out.print("Массив с четными числами: ");
            System.out.printf("%d ", arrEven[i]);
            even = even + arrEven[i];
        }
        System.out.println();
        if (arrEven.length == 0) System.out.println("Массив пуст");
        else System.out.println("Среднее значение: " + even/arrEven.length);
        for (int i = 0; i < arrNotEven.length; i++){
            if (i == 0) System.out.print("Массив с нечетными числами: ");
            System.out.printf("%d ", arrNotEven[i]);
            notEven = notEven + arrNotEven[i];
        }
        System.out.println();
        if (arrNotEven.length == 0) System.out.println("Массив пуст");
        else System.out.println("Среднее значение: " + notEven/arrNotEven.length);
    }
}
