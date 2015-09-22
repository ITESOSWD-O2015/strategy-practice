package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.NotDeflatable;
import com.iteso.strategy.behaviors.impl.IrregularBounce;

/**
 * Created by GeraCruz on 22/09/15.
 */
public class PoolBall extends Ball {
    public PoolBall() {
        setBounceBehavior(new IrregularBounce());
        setiDeflateBehavior(new NotDeflatable());
        setType("Pool Ball");
    }
}
