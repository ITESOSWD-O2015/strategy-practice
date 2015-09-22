package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.*;

/**
 * Created by GeovaniSerrano on 9/22/15.
 */
public class RugbyBall extends Ball {
    public RugbyBall() {
        setBounceBehavior(new IrregularBounce());
        setiDeflateBehavior(new NotDeflatable());
        setType("Rugby Ball");
        setFloatationBehavior(new NormalFloatation());
    }
}
