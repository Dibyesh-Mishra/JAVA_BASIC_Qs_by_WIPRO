/*Write a Program to accept two integers as command line arguments and print the sum of the two numbers

        Example1)

        C:\>java Sample 10 20

        O/P Expected: The sum of 10 and 20 is 30 */
public class Sample {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide two command line arguments.");
        } else {
            int firstDigit = Integer.parseInt(args[0]);
            int secondDigit = Integer.parseInt(args[1]);

            int sum = firstDigit + secondDigit;
            System.out.println("The sum of"+" "+firstDigit+" "+"and"+" "+secondDigit+" "+"is"+" "+sum);
        }
    }
}
