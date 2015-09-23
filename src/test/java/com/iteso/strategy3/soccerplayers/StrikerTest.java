package com.iteso.strategy3.soccerplayers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Aldo on 22/09/2015.
 */
public class StrikerTest {
    @Test
    public void testGoalKeeper(){
        Striker striker = new Striker();
        assertEquals("I'm attacking highly", striker.performAttack());
        assertEquals("I'm defending lowly", striker.performDefense());
        assertEquals("Striker is running", striker.run());


    }
}
