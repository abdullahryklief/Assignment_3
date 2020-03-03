package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class StudentTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void payFees() {
        Student s = new Student();
        s.setFees(100000);
        s.payFees(50000);
        Assert.assertEquals(50000, s.getFees());
    }
}