package org.ashish.algo;

/**
 *
 */
public class InsertionSort {
    public static void main(String[] args) {
        int[] p = {2,3,56,7,8,90,12,1};
        InsertionSort.insertionSort(p);
    }
    public static void insertionSort(int[] arr){
        int i,key=0;
        for (int j=1;j<arr.length;j++){
                key=arr[j];
                i=j-1;
                while(i>=0 && arr[i]>key){
                    arr[i+1]=arr[i];
                    i=i-1;
                }
            arr[i+1]=key;
        }
        System.out.println(arr.toString());
        for (int k : arr){
            System.out.print(k+" ");
        }
    }

}
