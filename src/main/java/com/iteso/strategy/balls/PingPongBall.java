package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.DoFloat;
import com.iteso.strategy.behaviors.impl.DoNotFloat;
import com.iteso.strategy.behaviors.impl.NormalBounce;
import com.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by GGGK4 on 22/09/2015.
 */
public class PingPongBall extends Ball {

    public PingPongBall(){

        setiFloatBehavior(new DoFloat());
        setiDeflateBehavior(new NotDeflatable());
        setBounceBehavior(new NormalBounce());
        setType("Ping Pong Ball");
    }
}
