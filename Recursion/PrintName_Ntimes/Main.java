package Recursion.PrintName_Ntimes;

import java.util.Scanner;

public class Main {

    public static void fnc(int i, int n){
        
        if(i > n) return; // base condition

        System.out.println("Abhishek "+i);
        fnc(i+1 , n);

    }

    // TC : 0(N)
    // SC : 0(N) internal memory
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N : ");
        int n = sc.nextInt();

        fnc(1,n);

        sc.close();
    }
}
