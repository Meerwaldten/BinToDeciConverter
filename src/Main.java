import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to the binary to decimal converter.");
        System.out.println("Type in a number with only 0's and 1's (binary!).");
        String numberToConvert = sc.nextLine();
        int convertedNumber = Integer.parseInt(numberToConvert,2);
        System.out.println(convertedNumber);



    }
}
