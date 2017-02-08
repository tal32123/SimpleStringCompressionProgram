/**
 * Created by Tal on 2/7/2017.
 */
public class Condenser {

    public String condenseString(String input){
        StringBuffer stringBuilder = new StringBuffer();

        // Check to see that input is not null and a length of 3 is the minimum for anything to even get compressed for example
        // aa becomes a2 which does not compress anything. However, aaa becomes a3 which does compress to become a3.
        if (input != null && input.length() > 2) {
            int i = 0;
            int counter = 0;

            while (i < input.length() - 1) {
                do {
                    counter++;
                    i++;
                }
                while (getCharacter(input, i).equals(getCharacter(input, i + 1)) && i < input.length() - 1);
                stringBuilder.append(getCharacter(input, i) + counter);
                counter = 0;

                System.out.println(stringBuilder);

            }
        }
        // Check which string is shorter and print out the string
        if (stringBuilder.length() < input.length()) {
            System.out.println("string = " + stringBuilder.toString());
            return stringBuilder.toString();
        }
        else {
            System.out.println("string = " + input);
            return input;
        }
    }
    private String getCharacter(String input, int position){
       return input.substring(position, position + 1);
    }
}
