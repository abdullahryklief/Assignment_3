package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class LecturerTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void salaryIncrease() {
        Lecturer l = new Lecturer();
        l.setSalary(10000);
        l.salaryIncrease(50);
        Assert.assertEquals(15000, l.getSalary());
    }
}