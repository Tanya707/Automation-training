package JavaFundamentals.OptionalTask1;

import java.util.Scanner;


import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
    public class FirstPoint {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number of numbers: ");
            int N = scan.nextInt();
            System.out.println("Enter the numbers: ");
            String[] arr = new String[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scan.next();
            }
            solve(arr);
            solve1(arr);
        }

        public static void solve(String[] arr) {
            int min = arr[0].length();
            int max = 0;
            for (String val : arr) {
                if (val.length() > max) max = val.length();
                else if (val.length() < min) min = val.length();
            }
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length() == max)
                    System.out.println("Max number is " + arr[i] + " his length " + arr[i].length());
                else if (arr[i].length() == min)
                    System.out.println("Min number is " + arr[i] + " his length " + arr[i].length());
            }
        }

        public static void solve1(String[] arr) {
                for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length - 1 - i; j++) {
                    if (arr[j].length() > arr[j + 1].length()) {
                        String str = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = str;
                    }
                }
            }
            for (int j = 0; j < arr.length; j++) {
                System.out.println("Number is " + arr[j] + " his length " + arr[j].length());

            }
        }
    }

