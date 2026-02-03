package Recursion.SumOf1stN_numbers;

import java.util.Scanner;

public class Main2 {

    //parametrized way
    public static int fnc(int n,int sum){
        if(n < 1) return sum;

        return fnc(n-1,sum+n);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n : ");
        int n = sc.nextInt();

        System.out.println("Sum : "+fnc(n,0));

        sc.close();

    }
}
