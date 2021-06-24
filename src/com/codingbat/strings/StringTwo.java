package com.codingbat.strings;

public class StringTwo {
    public static void main(String[] args) {
        System.out.println(new StringTwo().doubleChar("The"));
    }

    /*Given a string, return a string where for every char in the original,
    there are two chars.

    doubleChar("The") → "TThhee"
    doubleChar("AAbb") → "AAAAbbbb"
    doubleChar("Hi-There") → "HHii--TThheerree"*/
    public String doubleChar(String str) {
        StringBuilder strBuilder = new StringBuilder();

        for (char c : str.toCharArray())
            strBuilder.append(c).append(c);

        return strBuilder.toString();
    }
}
