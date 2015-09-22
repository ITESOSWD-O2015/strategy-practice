package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.*;

/**
 * Created by JoseFranco on 22/09/2015.
 */
public class RugbyBall extends Ball {
    public RugbyBall() {
        bounceBehavior = new NormalBounce();
        iDeflateBehavior = new Superflatable();
        iDeflateBehavior = new Deflatable();
        iFloatBehaviors = new Cfloat();
        type = "Rugby ball";
    }
}
