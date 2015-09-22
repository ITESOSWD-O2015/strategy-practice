package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.NotDeflatable;
import com.iteso.strategy.behaviors.impl.NormalBounce;

/**
 * Created by GeraCruz on 22/09/15.
 */
public class TennisBall extends Ball {
    public TennisBall() {
        setBounceBehavior(new NormalBounce());
        setiDeflateBehavior(new NotDeflatable());
        setType("Tennis ball");
    }
}
