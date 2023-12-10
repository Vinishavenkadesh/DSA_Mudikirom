package B_BinarySearch;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int [][] arr = {{18,9,12},{36,-4,91},{44,33,16}};
        int target = 91;
        System.out.println(binarySearch(arr, target));
        System.out.println(Arrays.toString(binarySearchIndex(arr, target)));
    }
    public static int binarySearch(int[][] arr,int target){
        for(int [] i : arr){
            for(int j : i)
            if(target == j)
            return j;
        }
        return -1;
    }

    public static int [] binarySearchIndex(int [][]arr,int target){
        for(int row = 0;row<arr.length;row++){
            for(int col = 0;col<arr[row].length;col++)
            if(arr[row][col] == target)
            return new int[]{row,col};
        }
        return new int[]{-1,-1};
    }
}
