package com.iteso.strategy3.position;

import com.iteso.strategy3.Position.Midfielder;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class MidfielderTest {

    @Test
    public void testMidfielder() {

        Midfielder midfielder = new Midfielder();

        assertEquals("I'm a super striker like CR7", midfielder.performAttack());
        assertEquals("I'm a powerful defender!!!", midfielder.performDefense());
        assertEquals("Complete midFielder (Yaya Toure) is a player!", midfielder.player());

    }
}
