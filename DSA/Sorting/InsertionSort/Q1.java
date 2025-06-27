/*
 Q:
Write a Java program that takes an array of integers as input and sorts it using insertion sort.
Let the user input the array size and its elements.
 */

import java.util.Arrays;
import java.util.Scanner;

public class Q1 {

    //Sorting Algorithm
    static void insertionSort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int current = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > current) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = current;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //User input
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        //Sorting
        insertionSort(arr);
        //output
        System.out.println("Sorted array: " + Arrays.toString(arr));

        sc.close();
    }
}
