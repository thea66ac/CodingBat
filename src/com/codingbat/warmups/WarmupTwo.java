package com.codingbat.warmups;

public class WarmupTwo {
    public static void main(String[] args) {
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

    /*Given a non-empty string like "Code" return a string like "CCoCodCode".

    stringSplosion("Code") → "CCoCodCode"
    stringSplosion("abc") → "aababc"
    stringSplosion("ab") → "aab"*/
    public String stringSplosion(String str) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            stringBuilder.append(str, 0, i + 1);
        }

        return stringBuilder.toString();
    }

    /*Given a string, return the count of the number of times that a substring length 2 appears
    in the string and also as the last 2 chars of the string, so "hixxxhi" yields 1
    (we won't count the end substring).

    last2("hixxhi") → 1
    last2("xaxxaxaxx") → 1
    last2("axxxaaxx") → 2*/
    public int last2(String str) {
        if (str.length() < 3)
            return 0;

        String lastTwo = str.substring(str.length() - 2);
        int count = 0;
        String tmp = "";

        for (int i = 0; i < str.length() - 2; i++) {
            tmp = str.substring(i, i + 2);
            if (tmp.equals(lastTwo))
                count++;
        }

        return count;
    }

    /*Given an array of ints, return the number of 9's in the array.

    arrayCount9([1, 2, 9]) → 1
    arrayCount9([1, 9, 9]) → 2
    arrayCount9([1, 9, 9, 3, 9]) → 3*/
    public int arrayCount9(int[] nums) {
        final int nine = 9;
        int count = 0;

        for (int num : nums)
            if (num == nine)
                count++;

        return count;
    }

    /*Given an array of ints, return true if one of the first 4 elements in the array is a 9.
    The array length may be less than 4.

    arrayFront9([1, 2, 9, 3, 4]) → true
    arrayFront9([1, 2, 3, 4, 9]) → false
    arrayFront9([1, 2, 3, 4, 5]) → false*/
    public boolean arrayFront9(int[] nums) {
        for (int i = 0; i < nums.length; i++)
            if (nums[i] == 9 && i < 4)
                return true;

        return false;
    }

    /*Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.

    array123([1, 1, 2, 3, 1]) → true
    array123([1, 1, 2, 4, 1]) → false
    array123([1, 1, 2, 1, 2, 3]) → true*/
    public boolean array123(int[] nums) {
        for (int i = 0; i < nums.length - 2; i++)
            if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3)
                return true;
        return false;
    }

    /*Given 2 strings, a and b, return the number of the positions where they contain the same
    length 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az"
    substrings appear in the same place in both strings.

    stringMatch("xxcaazz", "xxbaaz") → 3
    stringMatch("abc", "abc") → 2
    stringMatch("abc", "axc") → 0*/
    public int stringMatch(String a, String b) {
        int count = 0;

        for (int i = 0; i < a.length() - 1 &&  i < b.length() - 1; i++) {
            if (a.substring(i, i + 2).equals(b.substring(i, i + 2)))
                count++;
        }

        return count;
    }

    /*Given a string, return a version where all the "x" have been removed. Except an "x" at the
    very start or end should not be removed.

    stringX("xxHxix") → "xHix"
    stringX("abxxxcd") → "abcd"
    stringX("xabxxxcdx") → "xabcdx" */
    public String stringX(String str) {
        if (str.length() < 2)
            return str;

        char firstChar = str.charAt(0);
        String mid = str.substring(1, str.length() - 1).replaceAll("x", "");
        char lastChar = str.charAt(str.length() - 1);

        return firstChar + mid + lastChar;
    }

    /*Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens"
    yields "kien".

    altPairs("kitten") → "kien"
    altPairs("Chocolate") → "Chole"
    altPairs("CodingHorror") → "Congrr"*/
    public String altPairs(String str) {
        StringBuilder strBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i += 4) {
            strBuilder.append(str.charAt(i));
            if(i + 1 < str.length())
                strBuilder.append(str.charAt(i + 1));
        }

        return strBuilder.toString();
    }

    /*Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak"
    are removed, but the "a" can be any char. The "yak" strings will not overlap.

    stringYak("yakpak") → "pak"
    stringYak("pakyak") → "pak"
    stringYak("yak123ya") → "123ya"*/
    public String stringYak(String str) {
        // short solution => return str.replaceAll("y.k", "");
        StringBuilder strBuilder = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            if (i + 2 < str.length() && str.charAt(i) == 'y' && str.charAt(i + 2) == 'k')
                i += 2;
            else
                strBuilder.append(str.charAt(i));
        }

        return strBuilder.toString();
    }
}
