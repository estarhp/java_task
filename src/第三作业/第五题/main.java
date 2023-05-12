package 第三作业.第五题;

import java.util.ArrayList;
import java.util.Arrays;

public class main {

    public static void main(String[] args) {
        String S = "abcde";
        String[] words = {"a", "bb", "acd", "ace"};
        int count = countSubsequences(S, words);
        System.out.println(count);

    }

    public static int countSubsequences(String S, String[] words) {
        int count = 0;
        for (String word : words) {
            if (isSubsequence(word, S)) {
                count++;
            }
        }
        return count;
    }


    private static boolean isSubsequence(String word, String S) {
        if (word.length() == 0) {
            return true;
        }
        if (S.length() == 0) {
            return false;
        }
        if (word.charAt(0) == S.charAt(0)) {
            return isSubsequence(word.substring(1), S.substring(1));
        } else {
            return isSubsequence(word, S.substring(1));
        }
    }



}


