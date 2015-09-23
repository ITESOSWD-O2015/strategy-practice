package com.iteso.strategy3.position;

import com.iteso.strategy3.Position.Striker;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class StrikerTest {

    @Test
    public void testStriker() {

        Striker striker = new Striker();

        assertEquals("I'm a super striker like CR7", striker.performAttack());
        assertEquals("I defend poorly :(", striker.performDefense());
        assertEquals("Powerful striker (Cristiano Ronaldo) is a player!", striker.player());

    }
}
