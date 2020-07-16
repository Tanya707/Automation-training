package Fundamentals;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class JavaFundamentals {

    private void fetchChild(File file) {
        File writerFile = new File("JavaFundamentals.txt");
        try {
            writerFile.createNewFile();
            FileWriter writer = new FileWriter(writerFile, true);
            writer.write (file.getAbsolutePath() + "\n");
            writer.flush();
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
             if (file.isDirectory()) {
            File[] children = file.listFiles();
            for (File child : children) {
                this.fetchChild(child);
            }

        }    }

    public static void main(String[] args) {
        JavaFundamentals example = new JavaFundamentals();
        System.out.println("Write the way to directory:");
        Scanner scanner = new Scanner (System.in);
        String way = scanner.nextLine();
        File dir = new File(String.valueOf(way));
        example.fetchChild(dir);
    }
}
