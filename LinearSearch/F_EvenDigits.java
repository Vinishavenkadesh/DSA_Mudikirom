package LinearSearch;

public class F_EvenDigits {
    public static void main(String[] args) {
        int[] nums = { 12, 345, 2, 6, 7896 };
        System.out.println(findNumbers(nums));
        System.out.println(digits(23456));
        // Output:2
    }

    // static int findNumbers(int [] nums){
    // int count = 0;
    // for(int i : nums){
    // int num = 0;
    // while(i>0){
    // i = i/10;
    // num++;
    // }
    // if(num%2==0)
    // count++;
    // }
    // return count;
    // }

    static int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums)
            if (even(i))
                count++;
        return count;
    }

    static boolean even(int i) {
        return digits(i) % 2 == 0;
    }

    // static int digits(int i) {
    //     if (i < 0)
    //         i *= -1;

    //     if(i==0)
    //     return 1;

    //     int num = 0;
    //     while (i > 0) {
    //         num++;
    //         i /= 10;
    //     }
    //     return num;
    // }

    static int digits(int i){
        if(i<0)
        i *= -1;

        if(i == 0)
        return 1;

        return (int)(Math.log10(i) + 1);
    }
}
