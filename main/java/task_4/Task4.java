package task_4;

import Utils.Reader;

import java.io.IOException;

public class Task4 {
    public static void main(String[] args) throws IOException {

        System.out.println("Please enter the word:");
        String s = Reader.readlineFromConsole();

        int length = s.length();
        char [] chars = new char[length];

        //creation of arrays of letters
        for (int i = 0; i < length; i++) {
            chars[i] = s.charAt(i);
        }
        //comparing letters
        boolean isPalindrome = true;
        for (int i = 0; i < length/2 ; i++) {
            if (chars[i]!= chars[length - 1 - i]) {
                isPalindrome = false;
                break;
            }
        }
        if (isPalindrome)
            System.out.println("Word is a palindrome");
        else
            System.out.println("Word is not a palindrome ");


    }
}
