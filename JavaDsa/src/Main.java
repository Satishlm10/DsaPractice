public class Main {
    public static void main(String[] args) {
        recursiveMethod(5);
    }

    public static void recursiveMethod(int n){
        if (n<1){
            System.out.printf("%d is less than 1\n",n);
        }
        else {
            recursiveMethod(n-1);
            System.out.println(n);
        }
    }
}