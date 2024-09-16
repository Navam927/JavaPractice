package CourseHandOutProblems;

import java.util.Scanner;

public class CapitalizeFirstLetter {

    public static String helper(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        StringBuilder capitalizedStr = new StringBuilder();
        boolean capitalizeNext = true;

        for (char c : str.toCharArray()) {
            if (Character.isWhitespace(c)) {
                capitalizeNext = true;
                capitalizedStr.append(c);
            } else if (capitalizeNext) {
                capitalizedStr.append(Character.toUpperCase(c));
                capitalizeNext = false;
            } else {
                capitalizedStr.append(Character.toLowerCase(c));
            }
        }
        return capitalizedStr.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        sc.close();
        s = helper(s);
        System.out.println(s);
    }
}
