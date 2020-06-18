package com.corlett.coolstuff.service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
public class IsUniqueTest {

    @Test
    public void isUniqueTrue() {
        boolean test = IsUnique.isUnique("Goku");

        Assert.assertTrue(test);
    }

    @Test
    public void isUniqueFalse() {
        boolean test = IsUnique.isUnique("Vegeta");

        Assert.assertTrue(!test);
    }

}
