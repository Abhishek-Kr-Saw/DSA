package Recursion.ReverseArray;

import java.util.Scanner;

public class Main2 {
    // Reverse using one variable

    public static void reverseArray(int l, int[] arr){

        int n = arr.length;

        if(l >= n/2) return; // base condition

        int temp = arr[l];
        arr[l] = arr[n-l-1];
        arr[n-l-1] = temp;

        reverseArray(l+1,arr);
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        if (n < 0) {
            throw new IllegalArgumentException("Array size cannot be negative");
        }

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        reverseArray(0,arr);

        // print reversed array
        System.out.println("Reversed array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
