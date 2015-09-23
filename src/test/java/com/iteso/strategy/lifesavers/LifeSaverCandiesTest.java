package com.iteso.strategy.lifesavers;

import com.iteso.strategy2.lifesavers.LifesaverCandies;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by GGGK4 on 22/09/2015.
 */
public class LifeSaverCandiesTest {

    @Test
    public void testLifeSaverCandies() {
        LifesaverCandies lifesaverCandies = new LifesaverCandies();
        assertEquals("I'm floating", lifesaverCandies.floating());
        assertEquals("I'm a Lifesaver Candy", lifesaverCandies.display());

    }
}