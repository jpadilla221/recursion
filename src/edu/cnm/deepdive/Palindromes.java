package edu.cnm.deepdive;

public final class Palindromes {

  private Palindromes(){}

  private static boolean isPalindromeClean(String source) {
    return source.length() <= 1
        || (
            source.charAt(0) == source.charAt(source.length()) - 1)
        && isPalindromeClean(source.substring(1, source.length() - 1));

  }
    public static boolean isPalindrome(String source) {

    }
}

