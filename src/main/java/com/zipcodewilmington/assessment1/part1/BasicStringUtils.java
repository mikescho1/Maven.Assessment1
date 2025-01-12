package com.zipcodewilmington.assessment1.part1;

/**
 * Created by leon on 2/16/18.
 */
public class BasicStringUtils {
    /**
     * @param str string input from client
     * @return string with identical content, and the first character capitalized
     */
    public static String camelCase(String str) {
        String str2 = str.substring(0, 1).toUpperCase() + str.substring(1);

        return str2;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in the reverse order
     */
    public static String reverse(String str) {
        String str2 = "";
        for (Integer i = str.length() - 1; i >= 0; i--) {
            str2 += str.charAt(i);
        }

        return str2;
    }

    /**
     * @param str string input from client
     * @return string with identical contents, in reverse order, with first character capitalized
     */
    public static String reverseThenCamelCase(String str) {
        String str2 = reverse(str);
        String str3 = camelCase(str2);
        return str3;
    }


    /**
     * @param str a string input from user
     * @return string with identical contents excluding first and last character
     */
    public static String removeFirstAndLastCharacter(String str) {
        String str2 = str.substring(1, str.length() - 1);

        return str2;


    }

    /**
     * @param str a string input from user
     * @return string with identical characters, each with opposite casing
     */
    public static String invertCasing(String str) {

        return null;

        /*String[] strArr = str.split("");
        for (Integer i = 0; i < strArr.length; i++) {
                if (strArr[i] == Character.isUpperCase(strArr[i])) {
                    char letter = Character.toLowerCase(strArr[i].charAt(j));
                    str2 += letter;
                }
                else if (Character.isLowerCase(strArr[i].charAt(j))) {
                    char letter = Character.toLowerCase(strArr[i].charAt(j));
                    str2 += letter;
                } else  {
                    str2 += " ";

                }
            }
        }
        return str2;*/
    }
}
