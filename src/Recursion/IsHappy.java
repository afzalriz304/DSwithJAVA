package Recursion;

public class IsHappy {

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {
        int sum = 0;
        while(n>0){
            int r = n%10;
            n = n/10;
            sum+= Math.pow(r,2);
        }
        if(sum==1)
            return true;
        return isHappy(sum);
    }
}
