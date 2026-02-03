package Recursion.ReverseArray;

import java.util.Scanner;

public class Main {

    // Reverse using two variable

    public static void reverseArray(int l, int r, int[] arr){
        if(l >= r) return; // base condition

        int temp = arr[l];
        arr[l] = arr[r];
        arr[r] = temp;

        reverseArray(l+1, r-1,arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        if(n < 0){
            throw new IllegalArgumentException("Array size must be greater than zero");
        }

        int[] arr = new int[n];

        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        reverseArray(0,n-1,arr);

        // print reversed array
        System.out.println("Reversed array:");
        for (int x : arr) {
            System.out.print(x + " ");
        }

        sc.close();
    }
}
