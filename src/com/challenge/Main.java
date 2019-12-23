package com.challenge;

import UserInputUtil.UserInput;

public class Main {

    private static int n = 1;
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {

//    String stringFromUser = UserInput.getStringFromUser();
//    shortenTheWord(stringFromUser);

        System.out.println(shortenString("abcdeeefgghkkkkiooooo",1, 'a'));

    }


    public static String shortenTheWord(String inputString){
        for(int i = 0; i < inputString.length()-1;i++){
            if(inputString.charAt(i) == inputString.charAt(i+1)){
                n++;
                System.out.println("i = " + i);
                System.out.println("n = " + n);
                System.out.println(inputString.substring(i+1));
                shortenTheWord(inputString.substring(i+1));
            }else {
                if(n>1) {
                    sb.append(inputString.charAt(i)).append(n);
                    System.out.println(sb.toString());
                }else {
                    sb.append(inputString.charAt(i));
                    System.out.println(sb.toString());
                }
                n=0;
            }
        }
        System.out.println(sb.toString());
        return sb.toString();
    }

//    public static String shortedTheWord2(String inputString,int occurance){
//        if(inputString.charAt(1) == inputString.charAt(2)) {
//            n++;
//            System.out.println("String: " + inputString.substring(1));
//            if (inputString.substring(1).length() == 1 ) return "";
//            return shortedTheWord2(inputString.substring(1),n);
//        }
//        return sb.append();
//    }


    public static int sumAll (int input){
        if(input!=0) return sumAll(input-1) + input ;
        return 1;
    }

    public static int sumAll2(int input){
        if(input==0) return 1;
        else return input + sumAll2(input-1);
    }

    public static String shortenString(String inputString, int count, char letter){

        if(inputString.length()<=1 && count == 1) return inputString;
        if(inputString.length()<=1 && count >1) return inputString + count;
        if(inputString.charAt(0) == inputString.charAt(1)){
            count++;
            System.out.println("CHAR EQUAL: " +
                    "\nChar is: " + inputString.charAt(0)+
                    "\nPassed String: " + inputString.substring(1) +
                    "\nCount: " + count+ "\n");
            return  shortenString(inputString.substring(1), count,inputString.charAt(0));
        }else if(count>1) {
            System.out.println("Count >1: " +
                    "\nChar is: " + inputString.charAt(0)+
                    "\nPassed String: " + inputString.substring(1) +
                    "\nCount: " + count+ "\n");

            return String.valueOf(letter) + count + shortenString(inputString.substring(1), 1, inputString.charAt(0));
        }else
            System.out.println("NOT EQUAL: " +
                    "\nChar is: " + inputString.charAt(0)+
                    "\nPassed String: " + inputString.substring(1) +
                    "\nCount: " + count + "\n");
            return inputString.charAt(0) + shortenString(inputString.substring(1), 1, inputString.charAt(0));
    }

}

