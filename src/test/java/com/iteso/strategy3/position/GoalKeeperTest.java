package com.iteso.strategy3.position;

import com.iteso.strategy3.Position.Goalkeeper;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class GoalKeeperTest {

    @Test
    public void testGoalKeeper() {

        Goalkeeper goalkeeper = new Goalkeeper();

        assertEquals("I dont score that much!", goalkeeper.performAttack());
        assertEquals("I'm a powerful defender!!!", goalkeeper.performDefense());
        assertEquals("Goalkeeper(Casillas) is a player!", goalkeeper.player());

    }

}
