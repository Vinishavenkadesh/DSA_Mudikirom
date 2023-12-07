package BinarySearch;

import java.util.Arrays;

public class G_FirstLastPosition {
    public static void main(String[] args) {
        int [] nums = {5,7,7,8,8,8,8,10};
        int target = 8;
        // Output: [3,4]
        System.out.println(Arrays.toString(searchRange(nums, target)));
    }

    static int[] searchRange(int[] arr, int target) {
        if(arr.length == 0)
        return new int[]{-1,-1};
        else
        return new int[]{start(arr, target),end(arr, target)};
    }

    static int end(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target < arr[mid])
            end = mid - 1;
            else
            start = mid+1;
        }
        return end;
    }
    static int start(int[] arr, int target) {

        int start = 0;
        int end = arr.length - 1;
        while(start<=end){
            int mid = start + (end - start)/2;
            if(target > arr[mid])
            start = mid + 1;
            else
            end = mid-1;
        }
        return start;
    }
}