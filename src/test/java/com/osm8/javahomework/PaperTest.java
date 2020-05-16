package com.osm8.javahomework;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert.*;

public class PaperTest {

    Paper paper1;
    Paper paper2;
    Paper paper3;
    Paper paper4;
    Paper paper5;
    Paper paper6;

    @Before
    public void paperInit(){
        paper1 = new Paper("white", 1);
        paper2 = new Paper("blue", 1);
        paper3 = new Paper("white", 1);
        paper4 = new Paper("yellow", 0.2);
        paper5 = new Paper("green", 10);
        paper6 = new Paper("white", 1);
    }

    @Test
    public void testEquals() {
//       Рефлексивность
        Assert.assertEquals(paper1, paper1);
//        Симметричность
        Assert.assertEquals(paper1, paper3);
        Assert.assertEquals(paper3, paper1);
//        Транзитивность
        Assert.assertEquals(paper1, paper3);
        Assert.assertEquals(paper1, paper6);
        Assert.assertEquals(paper3, paper6);
//        Согласованность
        Assert.assertEquals(paper3, paper1);
        Assert.assertEquals(paper3, paper1);
//        Сравнение null
        Assert.assertNotEquals(paper1, null);
    }

    @Test
    public void testHashCode() {
        Assert.assertEquals(paper1.hashCode(), paper3.hashCode());
        Assert.assertNotEquals(paper1.hashCode(), paper2.hashCode());
        Assert.assertEquals(paper1.hashCode(), paper1.hashCode());
    }

    @Test
    public void compareTo() {
        Assert.assertEquals(paper1.compareTo(paper4), -1);
        Assert.assertEquals(paper1.compareTo(paper3), 0);
        Assert.assertEquals(paper1.compareTo(paper5), 1);
    }
}