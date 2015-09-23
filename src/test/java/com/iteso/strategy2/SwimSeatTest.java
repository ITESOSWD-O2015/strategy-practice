package com.iteso.strategy2;

import com.iteso.strategy2.lifesavers.SwimSeat;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class SwimSeatTest {

    @Test
    public void testSwimSeat() {

        SwimSeat swimseat = new SwimSeat();

        assertEquals( "I'm deflating!", swimseat.performDeflate());
        assertEquals("I'm inflating!", swimseat.performInflate());
        assertEquals("I'm floating", swimseat.floating());
        assertEquals("I'm a Swim seat", swimseat.display());

    }


}
