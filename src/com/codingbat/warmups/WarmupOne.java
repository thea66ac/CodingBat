package com.codingbat.warmups;

public class WarmupOne {
    public static void main(String[] args) {
        WarmupOne warmupOne = new WarmupOne();
    }

    /*Given a string, take the last char and return a new string with the last char added at the
    front and back, so "cat" yields "tcatt". The original string will be length 1 or more.

    backAround("cat") → "tcatt"
    backAround("Hello") → "oHelloo"
    backAround("a") → "aaa"*/
    public String backAround(String str) {
        char c = str.charAt(str.length() - 1);
        return c + str + c;
    }

    /*Return true if the given non-negative number is a multiple of 3 or a multiple of 5.

    or35(3) → true
    or35(10) → true
    or35(8) → false*/
    public boolean or35(int n) {
        return n % 3 == 0 || n % 5 == 0;
    }

    /*Given a string, return true if the string starts with "hi" and false otherwise.

    startHi("hi") → true
    startHi("hello hi") → false*/
    public boolean startHi(String str) {
        if (str.length() >= 2)
            str = str.substring(0, 2);
        return str.equals("hi");
    }

    /*We'll say that a number is "teen" if it is in the range 13..19 inclusive.
    Given 3 int values, return true if 1 or more of them are teen.

    hasTeen(13, 20, 10) → true
    hasTeen(20, 19, 10) → true
    hasTeen(20, 10, 13) → true*/
    public boolean hasTeen(int a, int b, int c) {
        int lower = 13;
        int upper = 19;

        return inRange(a, lower, upper) ||
                inRange(b, lower, upper) ||
                inRange(c, lower, upper);
    }

    public boolean inRange(int value, int lower, int upper) {
        return lower <= value && value <= upper;
    }

    /*Return true if the given string begins with "mix",
    except the 'm' can be anything, so "pix", "9ix" .. all count.

    mixStart("mix snacks") → true
    mixStart("pix snacks") → true
    mixStart("piz snacks") → false*/
    public boolean mixStart(String str) {
        if (str.length() > 2)
            str = str.substring(1, 3);
        return str.equals("ix");
    }

    /*Given 2 int values, return whichever value is nearest to the value 10, or return 0
    in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.

    close10(8, 13) → 8
    close10(13, 8) → 8
    close10(13, 7) → 0*/
    public int close10(int a, int b) {
        int absA = Math.abs(a - 10);
        int absB = Math.abs(b - 10);

        if (absA < absB)
            return a;
        else if (absB < absA)
            return b;
        else
            return 0;
    }

    /*Return true if the given string contains between 1 and 3 'e' chars.

    stringE("Hello") → true
    stringE("Heelle") → true
    stringE("Heelele") → false*/
    public boolean stringE(String str) {
        int count = 0;

        for (char c : str.toCharArray())
            if (c == 'e')
                count++;

        return count >= 1 && count <= 3;
    }

    /*Given a non-empty string and an int N, return the string made starting with char 0,
    and then every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on.
    N is 1 or more.

    everyNth("Miracle", 2) → "Mrce"
    everyNth("abcdefg", 2) → "aceg"
    everyNth("abcdefg", 3) → "adg"*/
    public String everyNth(String str, int n) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i = i + n)
            stringBuilder.append(str.charAt(i));

        return stringBuilder.toString();
    }

    /*We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
    We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.

    monkeyTrouble(true, true) → true
    monkeyTrouble(false, false) → true
    monkeyTrouble(true, false) → false*/
    public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
        return aSmile == bSmile;
    }

    /*We have a loud talking parrot. The "hour" parameter is the current hour time in the range 0..23.
    We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return true if we are in trouble.

    parrotTrouble(true, 6) → true
    parrotTrouble(true, 7) → false
    parrotTrouble(false, 6) → false*/
    public boolean parrotTrouble(boolean talking, int hour) {
        return talking && (hour < 7 || hour > 20);
    }

    /*Given 2 int values, return true if one is negative and one is positive. Except if the
    parameter "negative" is true, then return true only if both are negative.

    posNeg(1, -1, false) → true
    posNeg(-1, 1, false) → true
    posNeg(-4, -5, true) → true*/
    public boolean posNeg(int a, int b, boolean negative) {
        if (a > 0 && b < 0 && !negative)
            return true;
        if (a < 0 && b > 0 && !negative)
            return true;
        return a < 0 && b < 0 && negative;
    }

    /*Given a string, return a new string where the first and last chars have been exchanged.

    frontBack("code") → "eodc"
    frontBack("a") → "a"
    frontBack("ab") → "ba"*/
    public String frontBack(String str) {
        if (str.length() <= 1)
            return str;

        char front = str.charAt(0);
        char back = str.charAt(str.length() - 1);
        String mid = str.substring(1, str.length() - 1);

        return back + mid + front;
    }

    /*Given two temperatures, return true if one is less than 0 and the other is greater than 100.

    icyHot(120, -1) → true
    icyHot(-1, 120) → true
    icyHot(2, 120) → false*/
    public boolean icyHot(int temp1, int temp2) {
        return (temp1 < 0 && temp2 > 100) || (temp2 < 0 && temp1 > 100);
    }

    /*We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values,
    return true if one or the other is teen, but not both.

    loneTeen(13, 99) → true
    loneTeen(21, 19) → true
    loneTeen(13, 13) → false*/
    public boolean loneTeen(int a, int b) {
        boolean aIsTeen = isTeen(a);
        boolean bIsTeen = isTeen(b);

        // ^ -> XOR operator
        return aIsTeen ^ bIsTeen;
    }

    private boolean isTeen(int num) {
        return 13 <= num && num <= 19;
    }
}
