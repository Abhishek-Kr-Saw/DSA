package Recursion.SumOf1stN_numbers;

import java.util.Scanner;

public class Main {

    // functional way
    public static int fnc(int n){

        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        if(n == 0) return 0;
        return n + fnc(n-1);
    }

    // TC : 0(N)
    // SC : 0(N)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n : ");
        int n = sc.nextInt();

        System.out.println("Sum : "+fnc(n));

        sc.close();
    }
}
