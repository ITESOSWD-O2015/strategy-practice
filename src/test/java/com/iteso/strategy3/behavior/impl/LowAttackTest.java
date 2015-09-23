package com.iteso.strategy3.behavior.impl;

import com.iteso.strategy3.Behavior.impl.LowAttack;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class LowAttackTest {

    @Test
    public void testLowAttack() {

        LowAttack lowattack = new LowAttack();
        assertEquals("I dont score that much!", lowattack.offense());
    }
}
