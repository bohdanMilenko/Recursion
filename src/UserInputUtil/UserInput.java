package UserInputUtil;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserInput {

   private static Scanner scanner = new Scanner(System.in);

    public static String getStringFromUser(){
        String returnString = "";
        int i = 0;
        try {
            returnString = scanner.nextLine();
            while (true) {
                if (Pattern.matches("[a-zA-z]+", returnString)) {
                    return returnString;
                } else {
                    System.out.println("Please enter a string!");
                    returnString = scanner.nextLine();
                    i++;
                    if (i == 3) throw new RuntimeException("Invalid input 3 times in a row!");
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Wrong input from customer " + e.getMessage());
            e.printStackTrace();
        } catch (RuntimeException e) {
            System.out.println("Unable to get user input: " + e.getMessage());
            e.printStackTrace();
        }
        return returnString.substring(0, 1).toUpperCase() + returnString.substring(1).toLowerCase();
    }

}
