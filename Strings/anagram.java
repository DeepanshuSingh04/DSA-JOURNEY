package Strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "talent";
        String s2 = "latent";

        if (s1.length() != s2.length())
            System.out.println("false");

        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        for (int i = 0; i < a1.length; i++) {
            if (a1[i] != a2[i])
                System.out.println("false");
        }
        System.out.println("true");
    }
}
