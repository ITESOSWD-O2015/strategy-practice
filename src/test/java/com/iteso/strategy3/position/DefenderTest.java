package com.iteso.strategy3.position;

import com.iteso.strategy3.Position.Defender;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class DefenderTest {

    @Test
    public void testDefender() {

        Defender defender = new Defender();

        assertEquals("I give a lot of passes and score sometimes", defender.performAttack());
        assertEquals("I'm a powerful defender!!!", defender.performDefense());
        assertEquals("Complete Defender (Sergio Ramos) is a player!", defender.player());

    }

}
