/*Write a Program to accept a String as a command line argument and print a Welcome message as given below.

Example1)

C:\> java Sample John O/P Expected: Welcome John */

public class Sample {
    public static void main(String[] args) {
        // Check if there is at least one command line argument
        if (args.length == 0) {
            System.out.println("Please pass a command line argument.");
            System.exit(0);
        }

        // Get the command line argument
        String name = args[0];

        // Print the welcome message
        System.out.println("Welcome " + name);
    }
}
