package Recursion;

public class PowerOfNumber {
    public static void main(String[] args) {
        System.out.println(power(4,4));
    }

    public static int power(int base,int expo){
        if(expo < 0){
            return -1;
        }
        if(expo == 0 ){
            return 1;
        }
        return base * power(base,expo-1);
    }
}
