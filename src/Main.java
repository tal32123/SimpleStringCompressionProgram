import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Condenser condenser = new Condenser();
        System.out.println("Enter a word: ");
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        while (reader.hasNext()) {
            String word = reader.next();
            condenser.condenseString(word);
            System.out.println("Enter a word: ");

        }
    }
}
