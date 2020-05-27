package com.junittest;

import org.junit.Assert;
import org.junit.Test;

public class ScoreTest {
    @Test
    public void test1(){
        Score t1 = new Score(5, 5);
        Assert.assertEquals(false, t1.show());
    }
    @Test
    public void test2(){
        Score t2 = new Score(5, 0);
        Assert.assertEquals(false, t2.show());
    }
    @Test
    public void test3(){
        Score t3 = new Score(5, 1);
        Assert.assertEquals(false, t3.show());
    }
    @Test
    public void test4(){
        Score t4 = new Score(5, 9);
        Assert.assertEquals(true, t4.show());
    }
    @Test
    public void test5(){
        Score t5 = new Score(5, 10);
        Assert.assertEquals(true, t5.show());
    }
    @Test
    public void test6(){
        Score t6 = new Score(0, 5);
        Assert.assertEquals(false, t6.show());
    }
    @Test
    public void test7(){
        Score t7 = new Score(1, 5);
        Assert.assertEquals(false, t7.show());
    }
    @Test
    public void test8(){
        Score t8 = new Score(9, 5);
        Assert.assertEquals(false, t8.show());
    }
    @Test
    public void test9(){
        Score t9 = new Score(10, 5);
        Assert.assertEquals(false, t9.show());
    }
}
