package com.iteso.strategy.balls;


import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.DontFloat;
import com.iteso.strategy.behaviors.impl.IrregularBounce;
import com.iteso.strategy.behaviors.impl.NotDeflatable;


/**
 * Created by jose luis on 22/09/2015.
 */
public class BasketBall extends Ball {

    public BasketBall(){
        setFloatBehavior(new DontFloat());
        setiDeflateBehavior(new NotDeflatable());
        setBounceBehavior(new IrregularBounce());
        type = "BasketBall ball";
    }


}
