import java.util.Scanner;

public class kaprekarNumber {
    public static boolean isKaprekar(int n, int sq_n) {
        String s = Integer.toString(sq_n);
        int len = s.length();
        String left = s.substring(0,len/2);
        String right = s.substring(len/2,len);

        int leftInt = Integer.parseInt(left);
        int rightInt = Integer.parseInt(right);

        if(leftInt + rightInt == n) {
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sq_n = n * n;
        if(isKaprekar(n,sq_n)) {
            System.out.println("kaprekar");
        } else {
            System.out.println("not kaprekar");
        }
    }
}
