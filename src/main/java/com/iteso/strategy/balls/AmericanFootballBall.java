package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.Deflatable;
import com.iteso.strategy.behaviors.impl.IrregularBounce;
import com.iteso.strategy.behaviors.impl.NotDeflatable;
import com.iteso.strategy.behaviors.impl.Superflatable;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/7/13
 * Time: 6:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class AmericanFootballBall extends Ball {
    public AmericanFootballBall() {
        bounceBehavior =  new IrregularBounce();
        iDeflateBehavior = new Deflatable();
        iDeflateBehavior = new Superflatable();
        type = "American Football ball";
    }



}
