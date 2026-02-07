import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{

    private static void subsetSum(int idx,int[] arr,int sum,ArrayList<Integer> temp){
        
        if(idx == arr.length){
            temp.add(sum);
            return;
        }

        // pick
        subsetSum(idx+1, arr, sum + arr[idx], temp);

        // not pick
        subsetSum(idx+1,arr,sum,temp);
    }

    private static void findSubsets(int idx,int[] arr,List<Integer> ds,List<List<Integer>> ansList){
        ansList.add(new ArrayList<>(ds));

        for(int i=idx ; i<arr.length ; i++){
            if(i != idx && arr[i] == arr[i-1]) continue;
            ds.add(arr[i]);

            findSubsets(idx+1, arr, ds, ansList);
            ds.remove(ds.size() - 1);
        }
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the size of array");
        int n = sc.nextInt();

        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> temp = new ArrayList<>();
        subsetSum(0,arr,0,temp);

        List<List<Integer>> ansList = new ArrayList<>();
        findSubsets(0,arr,temp,ansList);

        System.out.println(ansList);

        sc.close();
    }
}