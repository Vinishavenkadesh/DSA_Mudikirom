package Searching;

import java.util.*;

public class B_LinearSearchString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Isha Venkadesh";
        System.out.println(Arrays.toString(name.toCharArray()));
        char target = sc.next().toLowerCase().trim().charAt(0);
        System.out.println(linearSearchString(name, target));
        System.out.println(linearSearchStringEnhance(name, target));
    }

    static boolean linearSearchString(String name, char target) {
        if (name.length() == 0)
            return false;
        for (int i = 0; i < name.length(); i++) {
            if (target == name.toLowerCase().charAt(i)) {
                return true;
            }
        }
        return false;
    }

    static boolean linearSearchStringEnhance(String name, char target){
        if(name == null)
        return false;

        for(char ch : name.toCharArray()){
            if(ch == target)
            return true;
        }
        return false;
    }
}
