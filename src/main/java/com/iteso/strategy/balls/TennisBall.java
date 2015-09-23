package com.iteso.strategy.balls;


import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.DoFloat;
import com.iteso.strategy.behaviors.impl.NormalBounce;
import com.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by jose luis on 22/09/2015.
 */
public class TennisBall extends Ball {
    public TennisBall(){
        setiDeflateBehavior(new NotDeflatable());
        setBounceBehavior(new NormalBounce());
        setFloatBehavior(new DoFloat());
        type = "Tennis Ball";
    }
}