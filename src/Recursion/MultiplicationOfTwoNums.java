package Recursion;

public class MultiplicationOfTwoNums {
    public static void main(String[] args) {
        int a =5;
        int b =8;
        if(a>b)
            System.out.println(multiplication(b,a,a,0));
        else
            System.out.println(multiplication(a,b,b,0));
    }

    private static int multiplication(int a, int b, int m,int p){
        if(a==0 || b==0)
            return 0;
        if(a==1)
            return b;
        if(b==1)
            return a;
        if(m==0)
            return p;
        p+=a;
        return multiplication(a,b,m-1,p);
    }
}
