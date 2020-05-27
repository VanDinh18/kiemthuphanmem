package com.boundarytest;

import org.junit.Assert;
import org.junit.Test;

public class ScoreTest {
    @Test
    public void test1(){
      ScoreUpdateAfterBoundaryTest t1 = new ScoreUpdateAfterBoundaryTest(5, 5);
        Assert.assertEquals(false, t1.show());
    }
    @Test
    public void test2(){
     ScoreUpdateAfterBoundaryTest t2 = new ScoreUpdateAfterBoundaryTest(5, 0);
        Assert.assertEquals(false, t2.show());
    }
    @Test
    public void test3(){
       ScoreUpdateAfterBoundaryTest t3 = new ScoreUpdateAfterBoundaryTest(5, 1);
        Assert.assertEquals(false, t3.show());
    }
    @Test
    public void test4(){
        ScoreUpdateAfterBoundaryTest t4 = new ScoreUpdateAfterBoundaryTest(5, 9);
        Assert.assertEquals(true, t4.show());
    }
    @Test
    public void test5(){
       ScoreUpdateAfterBoundaryTest t5 = new ScoreUpdateAfterBoundaryTest(5, 10);
        Assert.assertEquals(true, t5.show());
    }
    @Test
    public void test6(){
       ScoreUpdateAfterBoundaryTest t6 = new ScoreUpdateAfterBoundaryTest(0, 5);
        Assert.assertEquals(false, t6.show());
    }
    @Test
    public void test7(){
       ScoreUpdateAfterBoundaryTest t7 = new ScoreUpdateAfterBoundaryTest(1, 5);
        Assert.assertEquals(false, t7.show());
    }
    @Test
    public void test8(){
       ScoreUpdateAfterBoundaryTest t8 = new ScoreUpdateAfterBoundaryTest(9, 5);
        Assert.assertEquals(false, t8.show());
    }
    @Test
    public void test9(){
        ScoreUpdateAfterBoundaryTest t9 = new ScoreUpdateAfterBoundaryTest(10, 5);
        Assert.assertEquals(false, t9.show());
    }
    @Test
    public void test10(){
        ScoreUpdateAfterBoundaryTest t10 = new ScoreUpdateAfterBoundaryTest(5, 9);
        Assert.assertEquals(true, t10.checkVstep(9));
    }
}

