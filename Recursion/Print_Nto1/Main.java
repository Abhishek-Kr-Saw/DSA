package Recursion.Print_Nto1;

import java.util.Scanner;

public class Main {

    public static void printfnc(int cnt , int n){
        if(cnt < 1) return;

        System.out.println("Count : "+cnt);
        printfnc(cnt-1, 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N :");
        int n = sc.nextInt();

        printfnc(n,1);

        sc.close();
    }
}
