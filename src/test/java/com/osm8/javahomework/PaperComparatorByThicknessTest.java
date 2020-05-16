package com.osm8.javahomework;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PaperComparatorByThicknessTest {
    PaperComparatorByThickness comparator;
    Paper paper1;
    Paper paper2;
    Paper paper3;
    Paper paper4;
    @Before
    public void setUp() throws Exception {
        paper1 = new Paper("blue", 1);
        paper2 = new Paper("white", 0.2);
        paper3 = new Paper("cyan", 1);
        paper4 = new Paper("black", 2);
        comparator = new PaperComparatorByThickness();
    }

    @Test
    public void compare() {
        Assert.assertEquals(paper1.compareTo(paper2), -1);
        Assert.assertEquals(paper1.compareTo(paper3), 0);
        Assert.assertEquals(paper1.compareTo(paper4), 1);
    }
}