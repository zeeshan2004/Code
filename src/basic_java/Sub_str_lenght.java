package basic_java;


public class Sub_str_lenght {
    public static void main(String args[])
    {

        // Initializing String
        String Str = new String("Welcome to The World ");

        // using substring() to extract substring
        // returns (whiteSpace)geeksforgeeks

        System.out.print("The extracted substring is : ");
        System.out.println(Str.substring(2)); // start after the number what you provide
        System.out.println("the lenght of the string is : "+Str.length()); //Count the String Elements

    }

}
