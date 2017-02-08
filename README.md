# SimpleStringCompressionProgram
This is a very simple string compression program that I wrote in Java. The program asks for user input and then performs
basic string compression using the counts of repeated characters. For example, the string `aabcccccaaa` would become `a2b1c5a3`. 
If the "compressed" string would not become smaller than the original string, the method returns the original string.

## Structure
* `Main.java` gets the user input, passes it to the compressor, and displays the compressed string
* `Compressor.java` is the code for the actual compression of the string.
