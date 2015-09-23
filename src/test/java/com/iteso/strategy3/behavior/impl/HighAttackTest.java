package com.iteso.strategy3.behavior.impl;

import com.iteso.strategy3.Behavior.impl.HighAttack;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class HighAttackTest {

    @Test
    public void testHighAttack() {

        HighAttack highattack = new HighAttack();
        assertEquals("I'm a super striker like CR7", highattack.offense());
    }
}
