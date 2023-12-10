package A_BinarySearch;

import java.util.*;

public class A_BinarySearch {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] arr = { -123, -34, 0, 1, 1, 34, 56, 78, 99, 78 };
        System.out.print("Enter the target element : ");
        int target = sc.nextInt();//if target element is 1 it will give the index of 4 bcz of mid-1.
        System.out.println(binarySearchCode(arr, target));
    }

    static int binarySearchCode(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target > arr[mid])
                start = mid + 1;
            else if (target < arr[mid])
                end = mid - 1;
            else
                return mid;
        }
        return -1;
    }
}
