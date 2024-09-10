package ExceptionHandling;
import java.util.Scanner;

public class validPassword {
    public static boolean hasValidLength(int len) {
        return len >= 8 && len <= 15;
    }
    public static boolean hasNoSpace(String s) {
        for(int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == ' ') {
                return false;
            }
        }
        return true;
    }
    public static boolean containsLowerCase(String s) {
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch)){
                return true;
            }
        }
        return false;
    }
    public static boolean containsUpperCase(String s) {
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(Character.isUpperCase(ch)) {
                return true;
            }
        }
        return false;
    }
    public static boolean containsSpecialCharacter(String s) {
        String regex = "[!@#$%^&*()_+=|<>?{}\\[\\]~-]";

        // Check if the string contains any of the special characters
        for (int i = 0; i < s.length(); i++) {
            if (s.substring(i, i + 1).matches(regex)) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = s.length();
        sc.close();
        if(hasValidLength(n) && hasNoSpace(s) && containsLowerCase(s) && containsUpperCase(s) && containsSpecialCharacter(s)) {
            System.out.println("valid");
        } else {
            System.out.println("not valid");
        }
    }
}
