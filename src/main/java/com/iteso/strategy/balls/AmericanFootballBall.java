package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.Deflatable;
import com.iteso.strategy.behaviors.impl.IrregularBounce;
import com.iteso.strategy.behaviors.impl.NormalFloatation;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/7/13
 * Time: 6:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class AmericanFootballBall extends Ball {
    public AmericanFootballBall() {
        setBounceBehavior(new IrregularBounce());
        setiDeflateBehavior(new Deflatable());
        setType("American Football ball");
        setFloatationBehavior(new NormalFloatation());
    }

}
