
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Task32 {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scan = new Scanner(new FileReader("input.txt"));
        ArrayList<String> arrStr = new ArrayList<String>();

        while (scan.hasNext()) {
            arrStr.add(scan.nextLine());
        }
        scan.close();
        Collections.sort(arrStr);

        for (String anArrStr : arrStr) {
            System.out.println(anArrStr);
        }
    }
}