package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.DoFloat;
import com.iteso.strategy.behaviors.impl.IrregularBounce;
import com.iteso.strategy.behaviors.impl.Superflatable;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/7/13
 * Time: 6:44 PM
 * To change this template use File | Settings | File Templates.
 */
public class RugbyBall extends Ball {
    public RugbyBall() {
        bounceBehavior =  new IrregularBounce();
        iDeflateBehavior = new Superflatable();
        iFloatBehavior = new DoFloat();
        type = "Rugby ball";
    }
}
