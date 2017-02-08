import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//        Get user input and send file to the
        System.out.println("Enter a word: ");
        Scanner reader = new Scanner(System.in);
        while (reader.hasNext()) {
            String word = reader.next();
            System.out.println("String = " + Compressor.compress(word));
            System.out.println("Enter a word: ");

        }
    }
}
