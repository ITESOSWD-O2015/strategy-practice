package com.iteso.strategy.balls;

import com.iteso.strategy.behaviors.impl.*;
import com.iteso.strategy.Ball;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class TenisBall extends Ball {

    public TenisBall(){

        setBounceBehavior(new NormalBounce());
        setiDeflateBehavior(new NotDeflatable());
        setiFloatsBehavior(new PartTimeFloat());

        setType("Tenis ball");
    }

}
