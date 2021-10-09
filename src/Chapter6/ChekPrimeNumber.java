package Chapter6;

import java.util.Scanner;

public class ChekPrimeNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int n = s.nextInt();
        boolean isPrime = isPrime(n);
        //if (isPrime(n) );

        System.out.println( isPrime);
        //else

        //System.out.println(n + " is not a prime number");

    }

    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
