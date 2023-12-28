import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nhập đường dẫn file: ");
        Scanner scanner = new Scanner(System.in);
        String path = scanner.next();
        ReadFileExample readfileEx = new ReadFileExample();
        readfileEx.readFileText(path);
    }
}