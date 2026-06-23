package Strings;

import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();

        int i = 0, j = s.length() - 1;

        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                System.out.println("not palindrome");
                return;
            }
            i++;
            j--;
        }

        System.out.println("palindrome");

        
        //method 2 (using extra ispalindrome variable)

        // int i = 0;
        // int j = s.length() - 1;
        // boolean isPalindrome = true;

        // while (i < j) {
        //     if (s.charAt(i) != s.charAt(j)) {
        //         isPalindrome = false;
        //         break;
        //     }
        //     i++;
        //     j--;
        // }
        // if (isPalindrome) {
        //     System.out.println("palindrome");
        // } else {
        //     System.out.println("not palindrome");
        // }
    }
}
