package com.company;

import java.util.Random;

public class Main {

    private final static int ARRAY_SIZE = 5;

    public static void main(String[] args) {
        int arr[] = new int[ARRAY_SIZE];
        int even = 0;
        int notEven = 0;
        int arrEven[], arrNotEven[];
        Random random = new Random();
        for(int i = 0; i < arr.length; i++){
            arr[i] = random.nextInt(100) + 1;
            if(arr[i] % 2 == 0) even++;
            else notEven++;
        }
        printArr("Весь массив: ", arr);
        arrEven = new int[even];
        arrNotEven = new int[notEven];
        divideIntoEvenAndOdd(arr, arrEven, arrNotEven);
        printArr("Массив с четными числами: ", arrEven);
        System.out.println("Среднее значение: " + calculateAverage(arrEven));
        printArr("Массив с нечетными числами: ", arrNotEven);
        System.out.println("Среднее значение: " + calculateAverage(arrNotEven));
    }

    static void printArr(String nameArr, int[] arr){
        System.out.print(nameArr);
        if (arr.length == 0) System.out.println("Массив пуст");
        else {
            for (int i = 0; i < arr.length; i++){
                System.out.printf("%d ", arr[i]);
            }
            System.out.println();
        }
    }

    static void divideIntoEvenAndOdd(int[] arr, int[] arrEven, int[] arrNotEven){
        int even = 0;
        int notEven = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                arrEven[even] = arr[i];
                even++;
            }else {
                arrNotEven[notEven] = arr[i];
                notEven++;
            }
        }
    }

    static float calculateAverage(int[] arr){
        int mean = 0;
        for (int i = 0; i < arr.length; i++){
            mean = mean + arr[i];
        }
        return mean;
    }
}
