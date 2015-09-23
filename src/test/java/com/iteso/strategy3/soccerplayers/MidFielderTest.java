package com.iteso.strategy3.soccerplayers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Aldo on 22/09/2015.
 */
public class MidFielderTest {
    @Test
    public void testGoalKeeper(){
        MidFielder midFielder = new MidFielder();
        assertEquals("I'm attacking mediumly", midFielder.performAttack());
        assertEquals("I'm defending mediumly", midFielder.performDefense());
        assertEquals("Midfielder is running", midFielder.run());


    }
}
