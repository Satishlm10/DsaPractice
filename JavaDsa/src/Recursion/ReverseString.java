package Recursion;

public class ReverseString {
    public static void main(String[] args) {
        System.out.println(reverse("Hello"));
        String str = "Hello";
        System.out.println(str.substring(1));
    }

    public static String reverse(String str){
        if (str.isEmpty())
            return str;

        return reverse(str.substring(1)) + str.charAt(0);

    }
}
