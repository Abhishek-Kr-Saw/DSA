package Recursion.String_Palindrome;

import java.util.Scanner;

public class Main {

    public static boolean checkPalindrome(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }

        // Normalize the string
        s = s.toLowerCase();

        return checkPalindromeHelper(0, s);
    }

    public static boolean checkPalindromeHelper(int i,String s){
        int n = s.length();

        if(i >= n/2) return true;

        if(s.charAt(i) != s.charAt(n - i - 1)) return false;

        return checkPalindromeHelper(i+1, s);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the string : ");
        String str = sc.nextLine();

        System.out.println(checkPalindrome(str));

        sc.close();
    }
}
