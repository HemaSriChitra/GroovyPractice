class ReverseString{

 static void main(String[] arg) {

// declaring variable

String input = "WELCOME";

        // convert String to character array

        // using toCharArray

        char[] resultarray = input.toCharArray();

        //iteration

        for (int i = resultarray.length - 1; i >= 0; i--)

         // print reversed String

            System.out.println(resultarray[i]);

}
}