package com.challenge;

import UserInputUtil.UserInput;

public class Main {

    private static int n = 0;
    public static void main(String[] args) {

    String stringFromUser = UserInput.getStringFromUser();
    shortenTheWord(stringFromUser);

    }


    public static String shortenTheWord(String inputString){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < inputString.length();i++){
            if(inputString.charAt(i) == inputString.charAt(i+1)){
                n++;
                System.out.println(inputString.substring(i+n-1));
                shortenTheWord(inputString.substring(i+n-1));
            }else {
                if(n>0) {
                    sb.append(inputString.charAt(i)).append(n);
                    System.out.println(sb.toString());
                }else {
                    sb.append(inputString.charAt(i));
                    System.out.println(sb.toString());
                }
                n=0;
            }
        }
        return sb.toString();
    }
}
