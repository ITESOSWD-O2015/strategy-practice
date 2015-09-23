package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.NoFloat;
import com.iteso.strategy.behaviors.impl.NormalBounce;
import com.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by Feelpaa on 22/09/2015.
 */
public class BowlingBall extends Ball {

    public BowlingBall()
    {
        setBounceBehavior(new NormalBounce());
        setiDeflateBehavior(new NotDeflatable());
        setiFloatBehavior(new NoFloat());
        type = "BowlingBall";



    }
}
