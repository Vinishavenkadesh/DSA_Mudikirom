import java.util.*;

class A_PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int flag = 1;
        int n = sc.nextInt();
        if (n == 0 || n == 1)
            System.out.println("Neither Prime nor Composite");
        else if (n % 2 == 0)
            System.out.println("Composite Number");
        else {
            for (int i = 2; i < n / 2; i++) {
                if (n % i == 0) {
                    System.out.println("Composite Number");
                    flag = 0;
                    break;
                }
            }
            if(flag == 1)
            System.out.println("Prime Number");
        }
}
}