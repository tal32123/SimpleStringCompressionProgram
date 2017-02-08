/**
 * Created by Tal on 2/8/2017.
 */
public class Compressor {

    public static String compress(String input){
        int inputLength = input.length();
        StringBuffer compressedString = new StringBuffer();

//      Can't do anything if there is no input
        if(input != null && !input.isEmpty()){

            // Check to see that input is not null and a length of 3 is the minimum for anything to even get compressed for example
            // aa becomes a2 which does not compress anything. However, aaa becomes a3 which does compress to become a3.
            if(inputLength > 2){
//              Initialize an integer to count the current character and a counter to count the amount of repeating letters
                int i = 0;
                int counter = 1;
//
                while(i < inputLength - 1){

//                  Add the letter to the string
                    compressedString.append(input.substring(i, i + 1));

//                  If the first letter is the same as the next letter add one to the counter and go on to the next letter
                    while (input.substring(i, i + 1).equals(input.substring(i + 1, i + 2)) && i < inputLength - 2){
                        counter ++;
                        i++;
                    }

//                  Add the counter to the string, refresh counter, and move to next letter
                    compressedString.append(counter);
                    counter = 1;
                    i++;

                }
//              If last character is the same as the one before update the counter on the last character
                if(input.substring(inputLength - 2, inputLength - 1).equals(input.substring(inputLength - 1, inputLength))){
                    int lastCount = Integer.valueOf(compressedString.substring(compressedString.length() - 1, compressedString.length()));
                compressedString.delete(compressedString.length() - 1, compressedString.length());
                    compressedString.append(lastCount + 1);
                }

//                 Add last character to the string!
                else {
                    compressedString.append(input.substring(inputLength - 1, inputLength));
                    compressedString.append("1");
                }

//              If original input is shorter than the compression use original string instead!
                if (inputLength < compressedString.length()){
                    compressedString = new StringBuffer(input);
                }


            }

//          If input is less than or equal to 2 characters there is no reason to go through all of the compression as it will not do anything.
            else {
                compressedString.append(input);
            }

        }


//  Input is empty
    else {
            compressedString.append("Input can not be empty!");
        }
        return compressedString.toString();
    }
}

