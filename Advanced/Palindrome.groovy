class Palindrome {

    public static void main(String[] args) {
        //Intialization
        String Str = "Mom";

        String rev = "";
        //to find the number of characters in a string
        int length = Str.size();
        //to repeat a specific block of code a known number of times
        for(int i = length - 1; i >= 0; i --) {

            rev= rev + Str.charAt(i); 
        }
        // Case in-sensitive
        //to check the condition
        if (Str.equalsIgnoreCase(rev)) {
            //Print the statement
            println("String is Palindrome..");
        } else {
            //Print the statement
            println(" string is NOT a Palindrome..");
        }
    }
}