package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.DoFloat;
import com.iteso.strategy.behaviors.impl.DoNotFloat;
import com.iteso.strategy.behaviors.impl.IrregularBounce;
import com.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/7/13
 * Time: 6:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class BowlingBall extends Ball {
    public BowlingBall() {
        bounceBehavior =  new IrregularBounce();
        iDeflateBehavior = new NotDeflatable();
        iFloatBehavior = new DoNotFloat();
        type = "American Football ball";
    }

}
