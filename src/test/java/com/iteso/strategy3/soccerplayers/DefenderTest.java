package com.iteso.strategy3.soccerplayers;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Aldo on 22/09/2015.
 */
public class DefenderTest {
    @Test
    public void testDefender(){
        Defender defender = new Defender();
        assertEquals("I'm attacking mediumly", defender.performAttack());
        assertEquals("I'm defending highly", defender.performDefense());
        assertEquals("Defender is running", defender.run());


    }
}
