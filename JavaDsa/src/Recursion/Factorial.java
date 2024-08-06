package Recursion;

public class Factorial {
    public static void main(String[] args) {
        System.out.println(recursiveFactorial(4 ));
    }
    public static int recursiveFactorial(int n){
        if (n<0){
            System.out.println("Error: Factorial calculation can only be done for positive values");
             return n;
        }
        else if(n==0 || n==1){
            return 1;
        }
        else {
            return n  * recursiveFactorial(n - 1);
        }

    }
}
