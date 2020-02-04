package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;

class PalindromesTest {

  static final Object[][] positiveTestData = {
      {"racecar"},
      {"Race Car"},
      {"radar"},
      {""},
      {"x"},
      {"Xx"},
      {"A man, a plan, a canal - Panama!"}
  };

  static final String[] negativeTestData = {
      "xy",
      "sonar",
      "Madame, I'm Adam",
      "Burrito Dog"
  };

  private static Object[][] affirmativeCases() {
    return positiveTestData;
  }

  @ParameterizedTest

  @CsvFileSource(resources = "/affirmative.csv")
  void isPalindromeAffirmative(String testCase) {
    assertTrue(Palindromes.isPalindrome(testCase));
  }

  @Test
  void isPalindromeNegative() {
    for (String testCase : negativeTestData) {
      assertFalse(Palindromes.isPalindrome(testCase));
    }
  }

}