package com.iteso.strategy.balls;

import com.iteso.strategy.behaviors.impl.Deflatable;
import com.iteso.strategy.behaviors.impl.DoFloat;
import com.iteso.strategy.behaviors.impl.DoNotFloat;
import com.iteso.strategy.behaviors.impl.NormalBounce;
import com.iteso.strategy.Ball;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class TenisBall extends Ball {

    public TenisBall(){

        setBounceBehavior(new NormalBounce());
        setiDeflateBehavior(new Deflatable());
        setiFloatsBehavior(new DoFloat());

        setType("Tenis ball");
    }

}
