package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.Cfloat;
import com.iteso.strategy.behaviors.impl.NormalBounce;
import com.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by JoseFranco on 22/09/2015.
 */
public class QuidditchBall extends Ball {
    public QuidditchBall() {
        bounceBehavior = new NormalBounce();
        iDeflateBehavior = new NotDeflatable();
        iFloatBehaviors = new Cfloat();
        type = "Quidditch ball";
    }
}
