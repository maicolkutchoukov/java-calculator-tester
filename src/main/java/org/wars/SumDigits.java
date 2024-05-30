package org.wars;

public class SumDigits {
    public static int digital_root(int n) {
        while (n >= 10) {
            int sum = 0;
            while (n > 0) {
                sum += n % 10;
                n /= 10;
            }
            n = sum;
        }
        return n;
    }

    public static void main(String[] args) {
        System.out.println(SumDigits.digital_root(89));
    }
}
