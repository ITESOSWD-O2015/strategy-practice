package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.DoFloat;
import com.iteso.strategy.behaviors.impl.NormalBounce;
import com.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by GGGK4 on 22/09/2015.
 */
public class TennisBall extends Ball {

    public TennisBall(){

        setBounceBehavior(new NormalBounce());
        setiDeflateBehavior(new NotDeflatable());
        setiFloatBehavior(new DoFloat());
        setType("Tennis Ball");
    }
}
