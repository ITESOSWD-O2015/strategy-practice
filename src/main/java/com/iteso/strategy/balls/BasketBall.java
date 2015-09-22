package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.*;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class BasketBall extends Ball{

    public BasketBall(){

        setBounceBehavior(new NormalBounce());
        setiDeflateBehavior(new Deflatable());
        setiFloatsBehavior(new DoFloat());

        setType("Basket ball");
    }

}
