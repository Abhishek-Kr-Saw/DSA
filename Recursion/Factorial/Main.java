package Recursion.Factorial;

import java.util.Scanner;

public class Main {
    public static int fact(int n){

        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        if(n == 0) return 1;
        return n * fact(n-1);
    }

    // TC : 0(N)
    // SC : 0(N)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n : ");
        int n = sc.nextInt();

        System.out.println("Sum : "+fact(n));

        sc.close();
    }
}
