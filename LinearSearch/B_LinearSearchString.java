package LinearSearch;

import java.util.*;

public class B_LinearSearchString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = "Isha Venkadesh";
        System.out.print("Enter character to search : ");
        char target = sc.next().trim().charAt(0);
        System.out.println(linearSearch1(name, target));
        System.out.println(linearSearch2(name, target));
        System.out.println(Arrays.toString(name.toCharArray()));
    }

    static boolean linearSearch1(String name, char target) {

        if (name == null)
            return false;

        for (int i = 0; i < name.length(); i++) {
            if (target == name.charAt(i))
                return true;
        }
        return false;
    }

    static boolean linearSearch2(String name, char target) {
        if (name.length() == 0)
            return false;
        for (char ch : name.toLowerCase().toCharArray()) {
            if (ch == target)
                return true;
        }
        return false;
    }
}
