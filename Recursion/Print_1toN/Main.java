package Recursion.Print_1toN;

import java.util.Scanner;

public class Main {

    public static void printfnc(int cnt , int n){
        if(cnt > n) return;

        System.out.println("Count : "+cnt);
        printfnc(cnt+1, n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N :");
        int n = sc.nextInt();

        printfnc(1,n);

        sc.close();
    }
}
