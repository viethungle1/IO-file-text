import javax.swing.*;
import java.awt.image.BufferedImageFilter;
import java.io.IOException;
import java.io.*;
import java.util.Scanner;

public class CopyFile {
    public static void main(String[] args) throws IOException {
        copyFile("source.txt","target.txt");
    }
    public static void copyFile(String sourceFile, String targetFile) {
        try {
        File source = new File(sourceFile);
        File target = new File(targetFile);

        BufferedReader bf = new BufferedReader(new FileReader(source));
        PrintWriter writer = new PrintWriter(new PrintWriter(target));
        String line = "";
        while ((line = bf.readLine()) != null) {
            writer.println(line);
        }
        bf.close();
        writer.close();
        } catch (IOException e) {
            System.err.println(e);
        }
    }
}