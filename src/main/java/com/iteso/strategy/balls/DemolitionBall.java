package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.IrregularBounce;
import com.iteso.strategy.behaviors.impl.NoFloat;
import com.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by Feelpaa on 22/09/2015.
 */
public class DemolitionBall extends Ball {
    public DemolitionBall(){
        //ponemos el comportamiento de cada bola
        setBounceBehavior(new IrregularBounce());
        setiDeflateBehavior(new NotDeflatable());
        setiFloatBehavior(new NoFloat());
        type = "Demolition Ball";
    }

}
