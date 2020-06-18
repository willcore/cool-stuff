package com.corlett.coolstuff.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class PalindromePermuteTest {

    @Test
    public void testPalindrome() {
        Boolean res = PalindromePermute.palindromePermutate("tacocat");
        Assert.assertTrue(res);
    }

    @Test
    public void testNotPalindrome() {
        Boolean res = PalindromePermute.palindromePermutate("RyanDavis");
        Assert.assertFalse(res);
    }

    @Test
    public void testPalindromeWithSpacesCapitals() {
        Boolean res = PalindromePermute.palindromePermutate("Tact Coa");
        Assert.assertTrue(res);
    }

}

