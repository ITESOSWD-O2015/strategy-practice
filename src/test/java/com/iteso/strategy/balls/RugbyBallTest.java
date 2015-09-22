package com.iteso.strategy.balls;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class RugbyBallTest {

    @Test
    public void RugbyBallTest(){

      RugbyBall rugbyball = new RugbyBall();
      assertEquals("I'm bouncing irregularly!", rugbyball.performBounce());
      assertEquals("I'm deflating!", rugbyball.performDeflate());
      assertEquals("I'm inflating!",rugbyball.performInflate());
      assertEquals("Im floating!!", rugbyball.performFloat());
      assertEquals("Rugby ball is rolling!", rugbyball.roll());


    }
}
