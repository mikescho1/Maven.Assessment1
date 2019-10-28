package com.zipcodewilmington.assessment1.part5;

public class Palindrome {

    public boolean isPalindrom(String input) {

        int length = input.length();
        for (int j = 0; j < length; j++, length--) {
            if (input.charAt(j) != input.charAt(length - 1)) {
                return false;
            }

            }   return true;
        }



    public Integer countPalindromes(String input){

        System.out.println(isPalindrom("aaba"));


        String word = "";

        int count = 0;
        for(int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if(ch != ' ')   {
                word = word + ch;
            }   else    {
                if(isPalindrom(word))   {
                    count++;
                }   word = "";
            }
        }


        return count;
    }
}
