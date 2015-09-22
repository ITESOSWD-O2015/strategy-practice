package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.*;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class RugbyBall extends Ball{

    public RugbyBall(){

        setBounceBehavior(new IrregularBounce());
        setiDeflateBehavior(new Deflatable());
        setiFloatsBehavior(new DoFloat());

        setType("Rugby ball");
    }
}
