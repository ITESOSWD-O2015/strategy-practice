package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.*;

/**
 * Created by GeovaniSerrano on 9/22/15.
 */
public class TennisBall extends Ball {
    public TennisBall() {
        setBounceBehavior(new NormalBounce());
        setiDeflateBehavior(new NotDeflatable());
        setType("Tennis Ball");
        setFloatationBehavior(new PoorFloatation());
    }
}
