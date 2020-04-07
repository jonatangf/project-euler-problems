package com.jgarfer.euler.problem8;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Problem8Test {

    private Problem8 problem8;

    @Before
    public void setUp() {
        this.problem8 = new Problem8();
    }

    @Test
    public void test4() {
        assertEquals(5832, problem8.solve(4));
    }

    @Test
    public void test2() {
        assertEquals(81, problem8.solve(2));
    }

    @Test
    public void test3() {
        assertEquals(648, problem8.solve(3));
    }

    @Test
    public void test13() {
        assertEquals(2091059712, problem8.solve(13));
    }
}