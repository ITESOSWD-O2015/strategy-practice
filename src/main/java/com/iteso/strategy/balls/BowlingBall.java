package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.Crash;
import com.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by GeraCruz on 22/09/15.
 */
public class BowlingBall extends Ball {
    public BowlingBall() {
        setBounceBehavior(new Crash());
        setiDeflateBehavior(new NotDeflatable());
        setType("Bowling ball");
    }
}
