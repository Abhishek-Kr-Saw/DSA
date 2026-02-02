package Recursion.Print_1toN;

import java.util.Scanner;

public class Main2 {
    public static void printfnc(int cnt , int n){
            if(cnt < 1) return;
    
            printfnc(cnt-1, n); // Backtracking
            System.out.println("Count : "+cnt);
            
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
    
            System.out.print("Enter N :");
            int n = sc.nextInt();
    
            printfnc(n,n);
    
            sc.close();
        }
}
