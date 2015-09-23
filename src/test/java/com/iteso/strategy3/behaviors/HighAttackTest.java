package com.iteso.strategy3.behaviors;

import com.iteso.strategy3.behaviors.impl.HighAttack;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Created by Aldo on 22/09/2015.
 */
public class HighAttackTest {
    @Test
    public void testHighAttack(){
        HighAttack highAttack = new HighAttack();
        assertEquals("I'm attacking highly", highAttack.attack());


    }
}
