package Recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fib(4));
    }

    private static int fib(int nums) {
        if (nums == 0)
            return 0;
        if (nums == 1 || nums == 2)
            return 1;
        return fib(nums - 1) + fib(nums - 2);
    }
}
