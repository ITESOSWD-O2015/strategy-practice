package com.iteso.strategy2;

import com.iteso.strategy2.lifesavers.LifeSaversCandies;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class LifeSaversCandiesTest {

    @Test
    public void testLifeSaversCandies() {

        LifeSaversCandies livesaverscandies = new LifeSaversCandies();

        assertEquals("I can't deflate!", livesaverscandies.performDeflate());
        assertEquals("I can't inflate!", livesaverscandies.performInflate());
        assertEquals("I'm floating", livesaverscandies.floating());
        assertEquals("I'm a Life Savers Candies", livesaverscandies.display());

    }
}
