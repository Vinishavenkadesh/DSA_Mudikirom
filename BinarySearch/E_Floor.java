package BinarySearch;
import java.util.*;
import java.util.Scanner;

public class E_Floor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] arr = {-12,-3,0,1,23,34,56,67,78,89,99};
        System.out.print("Enter Target : ");
        int target = sc.nextInt();
        System.out.println(floor(arr, target));
    }
    //greatest number <= target
    static int floor(int [] arr,int target){
        if(target < arr[0])
        return -1;

        int start = 0;
        int end = arr.length-1;
        while(start<=end){
            int mid = start+(end-start)/2;
            if(target>arr[mid])
            start = mid+1;
            else if(target<arr[mid])
            end = mid-1;
            else
            return arr[mid];
        }
        return arr[end];
    }
}
