package com.iteso.strategy.balls;

import com.iteso.strategy.behaviors.impl.Deflatable;
import com.iteso.strategy.behaviors.impl.DoNotFloat;
import com.iteso.strategy.behaviors.impl.NormalBounce;
import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class BowlingBall extends Ball {

    public BowlingBall(){

        setBounceBehavior(new NormalBounce());
        setiDeflateBehavior(new NotDeflatable());
        setiFloatsBehavior(new DoNotFloat());

        setType("Bowling Ball");
    }


}
