import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class NextGreaterElement {

    public static void main(String [] args) {
        ArrayList<Integer> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.print("enter array size: ");
        int n = sc.nextInt();
        System.out.println("Enter "+ n + " elements to array: ");
        for(int i = 0; i < n; i++) {
            int k = sc.nextInt();
            al.add(k);
        }
        Collections.sort(al);
        al.remove(al.getLast());
        System.out.println("second largest element is: "+al.getLast());
    }
}
