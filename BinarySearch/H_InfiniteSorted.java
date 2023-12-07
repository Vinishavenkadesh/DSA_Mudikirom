package BinarySearch;

public class H_InfiniteSorted {
    public static void main(String[] args) {
        int[] arr = { 3, 5, 7, 9, 10, 15, 90, 100, 130, 140, 160, 170, 344, 555, 666, 777, 888, 999 };
        int target = 16;
        System.out.println(findingElement(arr, target));
    }

    static int findingElement(int [] arr,int target){
        int start = 0;
        int end = 1;
        while(target > arr[end]){
            start = end + 1;
            end = start*2+1;
        }
        return search(arr, target, start, end);
    }
    
    static int search(int [] arr,int target,int start, int end){
      while(start<=end){
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
}
