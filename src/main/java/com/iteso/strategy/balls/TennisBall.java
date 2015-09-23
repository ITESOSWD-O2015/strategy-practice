package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.IrregularBounce;
import com.iteso.strategy.behaviors.impl.NotDeflatable;
import com.iteso.strategy.behaviors.impl.ParcialFloat;

/**
 * Created by Feelpaa on 22/09/2015.
 */
public class TennisBall extends Ball {
    public TennisBall(){
        setBounceBehavior(new IrregularBounce());
        setiDeflateBehavior(new NotDeflatable());
        setiFloatBehavior(new ParcialFloat());
        type ="TennisBall";
    }

}
