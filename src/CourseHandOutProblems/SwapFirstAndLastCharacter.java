package CourseHandOutProblems;

import java.util.Scanner;

public class SwapFirstAndLastCharacter {
    public static String helper(String s) {
        if(s.length() < 2) {
            return s;
        }
        char[] arr = s.toCharArray();
        char temp = arr[0];
        arr[0] = arr[arr.length-1];
        arr[arr.length-1] = temp;

        return String.valueOf(arr);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        s = helper(s);
        System.out.println(s);
    }
}
