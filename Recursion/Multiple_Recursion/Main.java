package Recursion.Multiple_Recursion;

import java.util.Scanner;

public class Main {

    private static int fibonacci(int n){
        if(n <= 1) return n;

        return fibonacci(n-1)+fibonacci(n-2);
    }

    // TC : ~0(2ⁿ)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n : ");
        int n = sc.nextInt();

        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));
        
        sc.close();
    }
}
