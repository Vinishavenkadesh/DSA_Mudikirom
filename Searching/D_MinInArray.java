package Searching;
import java.util.*;
public class D_MinInArray {
    public static void main(String[] args) {
        int [] arr = {111,313,554,-65,76,34,55};
        minInArray(arr);
    }
    static void minInArray(int [] arr){
        int min = arr[0];
        for(int i : arr){
            if(i<min)
            min = i;
        }
        System.out.println(min);
    }
}
