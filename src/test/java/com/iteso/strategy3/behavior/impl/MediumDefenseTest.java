package com.iteso.strategy3.behavior.impl;

import com.iteso.strategy3.Behavior.impl.MediumDefense;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class MediumDefenseTest {

    @Test
    public void testMediumDefense() {

        MediumDefense mediumdefense = new MediumDefense();
        assertEquals("I tackle well but im very slow!", mediumdefense.defense());
    }
}
