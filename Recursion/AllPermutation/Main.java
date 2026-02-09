package Recursion.AllPermutation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static void allPermutaion2(int ind, int[] arr, List<List<Integer>> ans){
        if (ind == arr.length) {
            List<Integer> temp = new ArrayList<>();
            for (int x : arr) temp.add(x);
            ans.add(temp);
            return;
        }

        for(int i=ind;i<arr.length;i++){

            //swapping
            swap(i,ind,arr);
            allPermutaion2(ind+1, arr,ans);
            swap(i,ind,arr);

        }
    }

    private static void swap(int i, int j, int[] arr){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    private static void allPermutaion(int[] arr,List<Integer> ds,boolean[] freq){
        if(ds.size() == arr.length){
            System.out.println(ds);
            return;
        }

        // loop
        for(int i=0;i<arr.length;i++){
            if(!freq[i]){
                freq[i] = true;
                ds.add(arr[i]);
                allPermutaion(arr, ds, freq);
                ds.remove(ds.size() - 1);
                freq[i] = false;
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array : ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.print("Enter the array : ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        List<Integer> ds = new ArrayList<>();
        boolean freq[] = new boolean[n];
        allPermutaion(arr,ds,freq);

        System.out.println("----------------------------------------------------");

        List<List<Integer>> ans = new ArrayList<>();
        allPermutaion2(0, arr,ans);

        for (List<Integer> perm : ans) {
            System.out.println(perm);
        }
        sc.close();
    }
}
