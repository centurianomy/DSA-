//valid variable checker in java using regex
public class ValidVariable {
    public static void main(String[] args) {
        String str = "var_123";   // change input here

        if (str.matches("[a-zA-Z][a-zA-Z0-9_]*")) //check if the string starts with a letter followed by letters, digits, or underscores
        {
            System.out.println("Valid Variable");
        } else {
            System.out.println("Invalid Variable");
        }
    }
}

/*
    *- allows empty string as well as one or more occurrences of the preceding character or group
    +- doesnt allow empty spaces rest allows one or more occurrences of the preceding character or group
    ?- allows zero or one occurrences only (multiple occurences not allowed) 
*/