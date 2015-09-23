
package com.iteso.strategy3.behavior.impl;

import com.iteso.strategy3.Behavior.impl.MediumAttack;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class MediumAttackTest {

    @Test
    public void testMediumAttack() {

        MediumAttack mediumattack = new MediumAttack();
        assertEquals("I give a lot of passes and score sometimes", mediumattack.offense());
    }

}
