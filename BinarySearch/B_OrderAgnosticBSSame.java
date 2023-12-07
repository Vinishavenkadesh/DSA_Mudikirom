package BinarySearch;

import java.util.*;

public class B_OrderAgnosticBSSame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // int[] arr = { -89, -66, -55, 0, 1, 3, 54, 65, 76, 87, 98 };
        int[] arr = { 98, 87, 76, 65, 54, 43, 32, 11, 0, -1, -32 };

        System.out.print("Enter Target : ");
        int target = sc.nextInt();
        System.out.println(binarySearch(arr, target));
    }

    static int binarySearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid])
                return mid;

            if (arr[start] < arr[end]) {
                if (target < arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            } else {
                if (target > arr[mid])
                    end = mid - 1;
                else
                    start = mid + 1;
            }
        }
        return -1;
    }
}
