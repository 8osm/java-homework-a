package com.osm8.javahomework;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PaperComparatorByColorTest {
    PaperComparatorByColor comparator;
    Paper paper1;
    Paper paper2;
    Paper paper3;
    Paper paper4;
    @Before
    public void setUp() throws Exception {
        paper1 = new Paper("blue", 1);
        paper2 = new Paper("white", 1);
        paper3 = new Paper("cyan", 1);
        paper4 = new Paper("black", 1);
        comparator = new PaperComparatorByColor();
    }

    @Test
    public void compare() {
        Assert.assertEquals(comparator.compare(paper1, paper1), 0);
        Assert.assertTrue(comparator.compare(paper1, paper3) < 0);
        Assert.assertTrue(comparator.compare(paper1, paper4) > 0);
        Assert.assertTrue(comparator.compare(paper2, paper4) > 0);
    }
}