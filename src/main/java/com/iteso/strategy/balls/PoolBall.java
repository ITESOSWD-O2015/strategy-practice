package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.DoNotFloat;
import com.iteso.strategy.behaviors.impl.IrregularBounce;
import com.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by GGGK4 on 22/09/2015.
 */
public class PoolBall extends Ball {

    public PoolBall(){

        setiFloatBehavior(new DoNotFloat());
        setiDeflateBehavior(new NotDeflatable());
        setBounceBehavior(new IrregularBounce());
        setType("Pool Ball");
    }
}
