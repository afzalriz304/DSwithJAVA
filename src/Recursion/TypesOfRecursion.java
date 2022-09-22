package Recursion;

public class TypesOfRecursion {
    public static void main(String[] args) {
        printViaTailRecursion(5);
        System.out.println();
        printViaHeadRecursion(5);
    }

    /**
     * Tail recursion
     * @param num
     */
    public static void printViaTailRecursion(int num) {
        // base case
        if (num == 0)
            return;
        System.out.print(num + " ");
        printViaTailRecursion(num - 1);
    }

    /**
     * Head Recursion
     * @param num
     */
    public static void printViaHeadRecursion(int num) {
        // base case
        if (num == 0)
            return;
        printViaHeadRecursion(num - 1);
        System.out.print(num + " ");
    }

}

