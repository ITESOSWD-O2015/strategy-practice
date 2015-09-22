package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.DoNotFloat;
import com.iteso.strategy.behaviors.impl.IrregularBounce;
import com.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by GGGK4 on 22/09/2015.
 */
public class BowlingBall extends Ball {

    public BowlingBall(){

        setiFloatBehavior(new DoNotFloat());
        setBounceBehavior(new IrregularBounce());
        setiDeflateBehavior(new NotDeflatable());
        setType("Bowling Ball");
    }
}
