package BinarySearch;

public class K_RotatedSorted {
    public static void main(String[] args) {
        int [] nums = {5,1,3};
        int target = 5;
        // System.out.println(findingAnswer(nums, target));
        System.out.println(peak(nums));
    }

    static int findingAnswer(int [] arr,int target){
        int peak = peak(arr);
        int firstTry = binarySearch(arr, target, 0, peak);
        if(firstTry != -1)
        return firstTry;
        else
        return binarySearch(arr, target, peak+1, arr.length-1);
    }

    static int binarySearch(int [] arr,int target,int start,int end){
        while(start <= end){
            int mid = start + (end - start)/2;
            if(target > arr[mid])
            start = mid + 1;
            else if(target < arr[mid])
            end = mid - 1;
            else
            return mid;
        }
        return -1;
    }
    
    static int peak(int [] arr){
        int start = 0;
        int end = arr.length - 1;
        while(start < end){
            int mid = start+(end - start)/2;
            if(arr[mid] > arr[mid+1])
            end = mid;
            else
            start = mid+1;
        }
        return arr[start];
    }
}
