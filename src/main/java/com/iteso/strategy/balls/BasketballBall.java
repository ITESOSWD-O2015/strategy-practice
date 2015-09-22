package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.Deflatable;
import com.iteso.strategy.behaviors.impl.DoFloat;
import com.iteso.strategy.behaviors.impl.NormalBounce;

/**
 * Created by GGGK4 on 22/09/2015.
 */
public class BasketballBall extends Ball {

    public BasketballBall(){

        setBounceBehavior(new NormalBounce());
        setiDeflateBehavior(new Deflatable());
        setiFloatBehavior(new DoFloat());
        setType("Basketball Ball");

    }
}
