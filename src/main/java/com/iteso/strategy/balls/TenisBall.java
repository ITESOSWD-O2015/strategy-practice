package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.DoFloat;
import com.iteso.strategy.behaviors.impl.NotDeflatable;
import com.iteso.strategy.behaviors.impl.NormalBounce;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/7/13
 * Time: 6:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class TenisBall extends Ball {
    public TenisBall() {
        bounceBehavior =  new NormalBounce();
        iDeflateBehavior = new NotDeflatable();
        iFloatBehavior = new DoFloat();
        type = "American Football ball";
    }

}
