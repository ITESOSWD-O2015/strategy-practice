package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.*;
import com.iteso.strategy.behaviors.impl.DoFloat;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/7/13
 * Time: 6:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class AmericanFootballBall extends Ball {
    public AmericanFootballBall() {
        setiFloatBehavior(new DoFloat());
        setBounceBehavior(new IrregularBounce());
        setiDeflateBehavior(new Deflatable());
        setType("American Football ball");
    }

}
