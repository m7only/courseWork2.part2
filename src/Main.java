import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        WordCount count = new WordCount(scan());
        count.printResult();
    }
    public static String scan() {
        System.out.print("Введите строку: ");
        Scanner scanner = new Scanner(System.in);
//        return "yourapp the quick brown fox jumps over the lazy dog";
        return scanner.nextLine();
    }
}