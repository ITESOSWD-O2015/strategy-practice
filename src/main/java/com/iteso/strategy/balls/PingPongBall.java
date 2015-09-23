package com.iteso.strategy.balls;


import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.NormalBounce;
import com.iteso.strategy.behaviors.impl.DoFloat;
import com.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by jose luis on 23/09/2015.
 */
public class PingPongBall extends Ball {
    public PingPongBall(){
        setBounceBehavior(new NormalBounce());
        setFloatBehavior(new DoFloat());
        setiDeflateBehavior(new NotDeflatable());
        type ="Ping-Pong ball";
    }
}