package A_BinarySearch;

public class J_MountainArray {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5, 6, 4, 3, 1 };
        int target = 5;
        // Output: 2
        System.out.println(answer(arr, target));
    }

    static int answer(int[] arr, int target) {
        int peak = peak(arr);
        int firstTry = orderAgnostic(arr, target, 0, peak);
        if (firstTry != -1)
            return firstTry;
        else
            return orderAgnostic(arr, target, peak+1, arr.length - 1);
    }

    static int peak(int[] arr) {
        int start = 0;
        int end = arr.length - 1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1])
                end = mid;
            else
                start = mid + 1;
        }
        return start;
    }

    static int orderAgnostic(int[] arr, int target, int start, int end) {
        boolean isAsc = start < end;
        int ans = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target == arr[mid]) {
                return mid;
            }

            if (isAsc) {
                if (target > arr[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            } else {
                if (target < arr[mid])
                    start = mid + 1;
                else
                    end = mid - 1;
            }
        }
        return ans;
    }
}
