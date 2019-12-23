package com.challenge;

import UserInputUtil.UserInput;

public class Main {

    private static int n = 1;
    private static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) {

    String stringFromUser = UserInput.getStringFromUser();
    shortenTheWord(stringFromUser);

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

    public static String shortedTheWord2(String inputString,int occurance){
        if(inputString.charAt(1) == inputString.charAt(2)) {
            n++;
            System.out.println("String: " + inputString.substring(1));
            if (inputString.substring(1).length() == 1 ) return "";
            return shortedTheWord2(inputString.substring(1),n);
        }
        return sb.append();
    }
}
