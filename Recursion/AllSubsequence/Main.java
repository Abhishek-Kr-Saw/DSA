package Recursion.AllSubsequence;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static void allSubsequence(int i,int[] arr,ArrayList<Integer> temp){
        int n = arr.length;
        if(i >= n){
            System.out.println(temp);
            return;
        }

        // Enclude the element
        temp.add(arr[i]);
        allSubsequence(i+1, arr,temp);

        // Ignore the element
        temp.remove(temp.size() - 1);
        allSubsequence(i+1, arr,temp);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        allSubsequence(0,arr,new ArrayList<>());

        sc.close();
    }
}
