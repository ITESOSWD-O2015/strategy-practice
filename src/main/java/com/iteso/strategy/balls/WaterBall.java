package com.iteso.strategy.balls;


import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.Deflatable;
import com.iteso.strategy.behaviors.impl.DoFloat;
import com.iteso.strategy.behaviors.impl.IrregularBounce;

/**
 * Created by jose luis on 23/09/2015.
 */
public class WaterBall extends Ball {
    public WaterBall(){
        setBounceBehavior(new IrregularBounce());
        setiDeflateBehavior(new Deflatable());
        setFloatBehavior(new DoFloat());
        type ="WaterBall";
    }
}
