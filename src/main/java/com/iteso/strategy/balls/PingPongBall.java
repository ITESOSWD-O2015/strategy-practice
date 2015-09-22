package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.Deflatable;
import com.iteso.strategy.behaviors.impl.DoFloat;
import com.iteso.strategy.behaviors.impl.NormalBounce;
import com.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class PingPongBall extends Ball {

    public PingPongBall(){

        setBounceBehavior(new NormalBounce());
        setiDeflateBehavior(new NotDeflatable());
        setiFloatsBehavior(new DoFloat());

        setType("PingPong ball");
    }


}
