package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size arr1: ");
        int size1 = sc.nextInt();
        System.out.println("Enter size arr2: ");
        int size2 = sc.nextInt();

        int i;
	    int[] arr1 = new int[size1];
	    int[] arr2 = new int[size2];

	    for(i = 0; i < size1; i++){
            System.out.println("Enter arr1["+i+"] is :");
            arr1[i] = sc.nextInt();
        }
        for(i = 0; i < size2; i++){
            System.out.println("Enter arr2["+i+"] is :");
            arr2[i] = sc.nextInt();
        }

        int[] arr3 = new int[size1 + size2];
        for (i = 0; i < size1; i++){
            arr3[i] = arr1[i];
        }
        for(i = 0; i < size2; i++){
            arr3[size1 + i] = arr2[i];
        }
        for(int x : arr3){
            System.out.print( x + " ");
        }
    }
}
