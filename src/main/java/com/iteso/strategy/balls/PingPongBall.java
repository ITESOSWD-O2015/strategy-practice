package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.*;

/**
 * Created by JoseFranco on 22/09/2015.
 */
public class PingPongBall extends Ball {
    public PingPongBall() {
        bounceBehavior = new IrregularBounce();
        iDeflateBehavior = new NotDeflatable();
        iFloatBehaviors = new Cfloat();
        type = "Pingpong ball";
    }
}
