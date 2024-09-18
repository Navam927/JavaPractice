package CourseHandOutProblems;

import java.util.Scanner;

public class GreetingsInReverse {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            StringBuilder sb = new StringBuilder(sc.next());
            System.out.println(sb.reverse().toString());
        }
        sc.close();
    }
}
