import java.util.Scanner;

public class Validate {
    public static Scanner in = new Scanner(System.in);  // initialization of a scanner, in order to input option and input_option

    public static int validateOptionInteger() {
        while (true) {                              // while is true, input and passes option value
            try {
                int option = Integer.parseInt(in.next());
                return option;
            } catch (NumberFormatException e) {     // when it is not a valid integer displays error message and requests a new integer
                in.nextLine();
                System.out.print("That is not a valid integer, please try again");
            }
        }
    }
    public static int validateInputOptionInteger() {
        while (true) {                                          // while is true, input and passes input_option value
            try {
                int input_option = Integer.parseInt(in.next());     // input and passes option value
                return input_option;
            } catch (NumberFormatException e) {
                in.nextLine();
                System.out.print("That is not a valid integer, please try again"); // when it is not a valid integer displays error message and requests a new integer
            }
        }
    }

}
