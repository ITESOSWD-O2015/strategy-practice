package com.iteso.strategy3.behavior.impl;

import com.iteso.strategy3.Behavior.impl.HighDefense;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class HighDefenseTest {

    @Test
    public void testhHighDefense() {

        HighDefense highdefense = new HighDefense();
        assertEquals("I'm a powerful defender!!!", highdefense.defense());
    }
}
