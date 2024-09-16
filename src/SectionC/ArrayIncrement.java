package SectionC;

/*
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer.
 * The digits are ordered from most significant to the least significant in left-to-right order.
 * The large integer does not contain any leading O's.
 * Increment the large integer by one and return the resulting array of digits.
 * example arr[] = [1,2,3]
 * output arr[] = [1,2,4]
 * */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ArrayIncrement {

    public static void plusOne(ArrayList<Integer> al) {
        Collections.reverse(al);
        int carry = 1;
        int index = 0;

        while (carry != 0) {
            if (index < al.size()) {
                if (al.get(index) == 9) {
                    al.set(index, 0);
                    index++;
                } else {
                    int ele = al.get(index);
                    ele++;
                    al.set(index, ele);
                    carry = 0;
                }
            } else {
                al.add(1);
                carry = 0;
            }
        }
        Collections.reverse(al);
    }

    public static void display(Integer[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        ArrayList<Integer> al = new ArrayList<>();
        for (int i : arr) {
            al.add(i);
        }
        plusOne(al);
        Integer[] result = al.toArray(new Integer[0]);
        display(result);
    }
}
