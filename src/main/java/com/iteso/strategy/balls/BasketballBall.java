package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.iFloatBehaviors;
import com.iteso.strategy.behaviors.impl.Cfloat;
import com.iteso.strategy.behaviors.impl.Deflatable;
import com.iteso.strategy.behaviors.impl.NormalBounce;
import com.iteso.strategy.behaviors.impl.Superflatable;

/**
 * Created by JoseFranco on 22/09/2015.
 */
public class BasketballBall extends Ball {

    public BasketballBall() {
        bounceBehavior = new NormalBounce();
        iDeflateBehavior = new Deflatable();
        iFloatBehaviors = new Cfloat();
        iDeflateBehavior = new Superflatable();
        type = "Basketball ball";
    }
}
