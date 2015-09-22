package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.IrregularBounce;
import com.iteso.strategy.behaviors.impl.NormalFloatation;
import com.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by GeovaniSerrano on 9/22/15.
 */
public class BasketballBall extends Ball {
    public BasketballBall() {
        setBounceBehavior(new IrregularBounce());
        setiDeflateBehavior(new NotDeflatable());
        setType("Basketball Ball");
        setFloatationBehavior(new NormalFloatation());
    }
}
