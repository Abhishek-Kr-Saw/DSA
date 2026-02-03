package Recursion.Factorial;

import java.util.Scanner;

public class Main2 {
    public static int fact(int n,int sum){
        if(n < 1) return sum;

        return fact(n-1,sum*n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n : ");
        int n = sc.nextInt();

        System.out.println("Factorial : "+fact(n,1));

        sc.close();

    }
}
