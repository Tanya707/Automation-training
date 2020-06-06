
import java.util.Scanner;
import java.util.Stack;

public class Task31 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Inter a number:");
        Integer input = in.nextInt();
        Stack<Integer> result = new Stack<Integer>();
        while (input != 0) {
            result.push(input % (10));
            input = input / 10;
            System.out.print(result.pop());
        }
    }
}

