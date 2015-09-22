package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.Deflatable;
import com.iteso.strategy.behaviors.impl.DoFloat;
import com.iteso.strategy.behaviors.impl.NormalBounce;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/7/13
 * Time: 6:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class BasketballBall extends Ball {
    public BasketballBall() {
        bounceBehavior =  new NormalBounce();
        iDeflateBehavior = new Deflatable();
        iFloatBehavior = new DoFloat();
        type = " Basketball ball";
    }

}
