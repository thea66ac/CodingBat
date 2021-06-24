package com.codingbat.strings;

public class StringThree {
    public static void main(String[] args) {
        System.out.println(new StringThree().countYZ("fez day"));
    }

    /*Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and 
    the 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z 
    is at the end of a word if there is not an alphabetic letter immediately following it. 
    (Note: Character.isLetter(char) tests if a char is an alphabetic letter.)

    countYZ("fez day") → 2
    countYZ("day fez") → 2
    countYZ("day fyyyz") → 2*/
    public int countYZ(String str) {
        str = str + "1";
        str = str.toLowerCase();
        int count = 0;
        char tmp = '\u0000';
        for (int i = 0; i < str.length(); i++) {
            if (!Character.isLetter(str.charAt(i)) && (tmp == 'y' || tmp == 'z') ) {
                count++;
            }
            tmp = str.charAt(i);
        }
        return count;
    }
}
