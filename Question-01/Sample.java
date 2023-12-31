/*Write a Program that accepts two Strings as command line arguments and generate the output in the required format.
Example1)
If the two command line arguments are Wipro and Bangalore then the output generated should be Wipro Technologies Bangalore.

Example2)
If the command line arguments are ABC and Mumbai then the output generated should be ABC Technologies Mumbai

[Note: It is mandatory to pass two arguments in command line]
*/
public class Sample {
    public static void main(String[] args) {
        if (args.length != 2) {
            System.out.println("Please provide two command line arguments.");
        } else {
            String companyName = args[0];
            String location = args[1];
            String output = companyName + " Technologies " + location;
            System.out.println(output);
        }
    }
}

