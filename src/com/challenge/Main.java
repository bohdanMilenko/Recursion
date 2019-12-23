package com.challenge;

import UserInputUtil.UserInput;

public class Main {
    

    public static void main(String[] args) {

        String stringFromUser = UserInput.getStringFromUser();
        System.out.println(shortenString(stringFromUser, 1, 'a'));

    }


    public static String shortenString(String inputString, int count, char letter) {

        if (inputString.length() <= 1 && count == 1) return inputString;
        if (inputString.length() <= 1 && count > 1) return inputString + count;
        if (inputString.charAt(0) == inputString.charAt(1)) {
            count++;
            System.out.println("CHAR EQUAL: " +
                    "\nChar is: " + inputString.charAt(0) +
                    "\nPassed String: " + inputString.substring(1) +
                    "\nCount: " + count + "\n");
            return shortenString(inputString.substring(1), count, inputString.charAt(0));
        } else if (count > 1) {
            System.out.println("Count >1: " +
                    "\nChar is: " + inputString.charAt(0) +
                    "\nPassed String: " + inputString.substring(1) +
                    "\nCount: " + count + "\n");

            return String.valueOf(letter) + count + shortenString(inputString.substring(1), 1, inputString.charAt(0));
        } else
            System.out.println("NOT EQUAL: " +
                    "\nChar is: " + inputString.charAt(0) +
                    "\nPassed String: " + inputString.substring(1) +
                    "\nCount: " + count + "\n");
        return inputString.charAt(0) + shortenString(inputString.substring(1), 1, inputString.charAt(0));
    }

}

