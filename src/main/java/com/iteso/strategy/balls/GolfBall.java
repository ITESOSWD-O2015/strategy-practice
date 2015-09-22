package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.NotDeflatable;
import com.iteso.strategy.behaviors.impl.IrregularBounce;

/**
 * Created by GeraCruz on 22/09/15.
 */
public class GolfBall extends Ball {
    public GolfBall() {
        setBounceBehavior(new IrregularBounce());
        setiDeflateBehavior(new NotDeflatable());
        setType("Golf ball");
    }
}
