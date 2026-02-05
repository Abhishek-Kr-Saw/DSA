package Recursion.PrintSubsequenceosSumK;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static void allSubsequenceOfSumK(int idx,int[] arr,int k,ArrayList<Integer> temp,int currentSum){
        int n = arr.length;
        if(idx == n){
            if(currentSum == k){
                System.out.println(temp);
            }
            return;
        }

        // pick
        temp.add(arr[idx]);
        allSubsequenceOfSumK(idx+1,arr,k,temp,currentSum + arr[idx]);

        // not pick
        temp.remove(temp.size() - 1);
        allSubsequenceOfSumK(idx+1,arr,k,temp,currentSum);
    }

    private static boolean oneSubsequenceOfSumK(int idx,int[] arr,int k,ArrayList<Integer> temp,int currentSum){
        int n = arr.length;
        if(idx == n){
            if(currentSum == k){
                System.out.println(temp);
                return true;
            }
            else return false;
        }

        // pick
        temp.add(arr[idx]);
        if(oneSubsequenceOfSumK(idx+1,arr,k,temp,currentSum + arr[idx]) == true) {
            return true;
        }

        // not pick
        temp.remove(temp.size() - 1);
        if(oneSubsequenceOfSumK(idx+1,arr,k,temp,currentSum) == true) return true;
        
        return false;
    }


    private static int countSubsequenceSumtoK(int i,int[] arr,int k,int currentSum){
        int n = arr.length;

        if(i == n){
            if(currentSum == k){
                return 1; // when condition satisfied
            }else{
                return 0; // when condition doesm't satisfied
            }
        }

        currentSum += arr[i];
        int l = countSubsequenceSumtoK(i+1, arr, k, currentSum);

        currentSum -= arr[i];
        int r = countSubsequenceSumtoK(i+1, arr, k, currentSum);

        return l+r;
    }

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        if (n < 0) {
            throw new IllegalArgumentException("n must be non-negative");
        }

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter sum value : ");
        int k = sc.nextInt();

        allSubsequenceOfSumK(0,arr,k,new ArrayList<>(),0);
        System.out.println("------------------------------------------------------");

        oneSubsequenceOfSumK(0,arr,k,new ArrayList<>(),0);
        System.out.println("------------------------------------------------------");

        int cnt = countSubsequenceSumtoK(0,arr,k,0);
        System.out.println("Count "+cnt);

        sc.close();
    }
}
