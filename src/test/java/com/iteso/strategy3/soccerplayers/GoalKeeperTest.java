package com.iteso.strategy3.soccerplayers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Aldo on 22/09/2015.
 */
public class GoalKeeperTest {
    @Test
    public void testGoalKeeper(){
        GoalKeeper goalKeeper = new GoalKeeper();
        assertEquals("I'm attacking lowly", goalKeeper.performAttack());
        assertEquals("I'm defending highly", goalKeeper.performDefense());
        assertEquals("Goalkeeper is running", goalKeeper.run());


    }
}
