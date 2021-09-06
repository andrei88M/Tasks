package org.example;

import junit.framework.TestCase;
import org.junit.Assert;

public class GenerateTest extends TestCase {

    public void testRandomValue() {
        Assert.assertTrue(Generate.randomValue()>=0.1 && Generate.randomValue()<=1);
    }
}