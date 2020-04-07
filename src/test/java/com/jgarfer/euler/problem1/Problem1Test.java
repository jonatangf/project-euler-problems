package com.jgarfer.euler.problem1;

import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class Problem1Test {

    private Problem1 problem1;

    @Before
    public void setUp() {
        problem1 = new Problem1();
    }

    @Test
    public void test1() {
        assertEquals(23, problem1.solve(3, 5, 10));
    }

    @Test
    public void test2() {
        assertEquals(233168, problem1.solve(3, 5, 1000));
    }
}
