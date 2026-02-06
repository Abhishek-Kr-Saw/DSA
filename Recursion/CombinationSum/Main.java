package Recursion.CombinationSum;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    private static void findCombinationSum(int idx, int[] arr, int currentTarget, ArrayList<Integer> temp){
        int n = arr.length;
        if(idx == n){
            if(currentTarget == 0){
                System.out.println(temp);
                return;
            }else{
                return;
            }
        }

        //pick up
        if(arr[idx] <= currentTarget){
            temp.add(arr[idx]);
            findCombinationSum(idx,arr,currentTarget - arr[idx],temp);
            temp.remove(temp.size() - 1);
        }
        findCombinationSum(idx+1,arr,currentTarget,temp);
    }

    private static void findUniqueCombinationSum(int idx, int[] arr, int currentTarget, ArrayList<Integer> temp){
        int n = arr.length;
        
        if(currentTarget == 0){
            System.out.println(temp);
            return;
        }

        for(int i=idx; i<n;i++){
            if(i > idx && arr[i] == arr[i-1]) continue; // skip duplicates
            if(arr[i] > currentTarget) break;          // stop when target exceed
            
            
            temp.add(arr[i]);
            findUniqueCombinationSum(i+1,arr,currentTarget - arr[i],temp);
            temp.remove(temp.size() - 1);
        
        }
        
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of an array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter the target : ");
        int target = sc.nextInt();

        Arrays.sort(arr);
        findUniqueCombinationSum(0,arr,target,new ArrayList<>());

        findCombinationSum(0,arr,target,new ArrayList<>());

        sc.close();

    }
}
