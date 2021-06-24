package com.codingbat.warmups;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WarmupTwo {
    public static void main(String[] args) {
        String str = "332,4;823,1;2,1";

        Pattern pattern = Pattern.compile("[-+]?[0-9]+");
        Matcher matcher = pattern.matcher(str);

        while (matcher.find()) {
            System.out.println(str.substring(matcher.start(), matcher.end()));
        }
    }

    /*Given a string and a non-negative int n, return a larger string that is n copies of the
    original string.

    stringTimes("Hi", 2) → "HiHi"
    stringTimes("Hi", 3) → "HiHiHi"
    stringTimes("Hi", 1) → "Hi"*/
    public String stringTimes(String str, int n) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < n; i++)
            stringBuilder.append(str).append(str);

        return stringBuilder.toString();
    }

    /*Given a string and a non-negative int n, we'll say that the front of the string is the first 3
    chars, or whatever is there if the string is less than length 3. Return n copies of the front;

    frontTimes("Chocolate", 2) → "ChoCho"
    frontTimes("Chocolate", 3) → "ChoChoCho"
    frontTimes("Abc", 3) → "AbcAbcAbc"*/
    public String frontTimes(String str, int n) {
        StringBuilder strBuilder = new StringBuilder();

        if (str.length() > 3)
            str = str.substring(0, 3);

        for (int i = 0; i < n; i++)
            strBuilder.append(str);

        return strBuilder.toString();
    }

    /*Count the number of "xx" in the given string. We'll say that overlapping is allowed,
    so "xxx" contains 2 "xx".

    countXX("abcxx") → 1
    countXX("xxx") → 2
    countXX("xxxx") → 3*/
    public int countXX(String str) {
        char[] chars = str.toCharArray();

        char previousChar = '\u0000';

        if (chars.length > 0)
            previousChar = chars[0];

        int count = 0;

        //It can be solved much more efficiently with the substring() method.
        for (int i = 1; i < chars.length; i++) {
            if (previousChar == 'x' && chars[i] == 'x')
                count++;
            previousChar = chars[i];
        }

        return count;
    }

    /*Given a string, return true if the FIRST instance of "x" in the string is immediately followed
    by another "x".

    doubleX("axxbb") → true
    doubleX("axaxax") → false
    doubleX("xxxxx") → true*/
    public boolean doubleX(String str) {
        boolean isDoubleX = false;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == 'x') {
                if (str.startsWith("xx", i)) {
                    isDoubleX = true;
                }
                break;
            }
        }

        return isDoubleX;
    }

    /*Given a string, return a new string made of every other char starting with the first,
    so "Hello" yields "Hlo".

    stringBits("Hello") → "Hlo"
    stringBits("Hi") → "H"
    stringBits("Heeololeo") → "Hello"*/
    public String stringBits(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        if (!str.isEmpty())
            stringBuilder.append(str.charAt(0));

        for (int i = 2; i < str.length(); i += 2)
            stringBuilder.append(str.charAt(i));

        return stringBuilder.toString();
    }
}
