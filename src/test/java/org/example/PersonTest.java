package org.example;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Before
    public void setUp() throws Exception {
    }

    @Test
    public void calculateAge() {
        Person p = new Person();
        p.setBirthYear(1996);
        Assert.assertEquals(24,p.CalculateAge());
    }
}