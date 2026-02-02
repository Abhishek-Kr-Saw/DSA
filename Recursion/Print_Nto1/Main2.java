package Recursion.Print_Nto1;

import java.util.Scanner;

public class Main2 {
    public static void printfnc(int cnt , int n){
        if(cnt > n) return;

        printfnc(cnt+1, n);  // recursion
        System.out.println("Count : "+cnt);  // backtracking
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N :");
        int n = sc.nextInt();

        printfnc(1,n);

        sc.close();
    }
}
