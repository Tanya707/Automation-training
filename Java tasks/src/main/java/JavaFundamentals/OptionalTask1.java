package JavaFundamentals;

import java.util.Scanner;

    public class OptionalTask1 {

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter the number of numbers: ");
            int N = scan.nextInt();
            System.out.println("Enter the numbers: ");
            String[] arr = new String[N];
            for (int i = 0; i < N; i++) {
                arr[i] = scan.next();
            }
            System.out.println("Min/max numbers length:");
            MaxMinLengthOfNumbers(arr);
            System.out.println("Sort numbers of length:");
            SortNumbersOfLength(arr);
            System.out.println("Longer average number length:");
            LongerAverageNumberLength(arr);
        }

        public static void MaxMinLengthOfNumbers(String[] arr) {
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

        public static void SortNumbersOfLength(String[] arr) {
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

        public static void LongerAverageNumberLength(String[] arr) {
            int sum = 0;
            float average;
            for (String val : arr) {
                sum += val.length();
            }
            average = (sum) / arr.length;
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].length() > average)
                    System.out.println("Number is " + arr[i] + " his length " + arr[i].length());
            }
        }
    }

