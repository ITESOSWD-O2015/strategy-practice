package com.iteso.strategy2.lifesavers;

import com.iteso.strategy.behaviors.impl.Deflatable;
import com.iteso.strategy.behaviors.impl.DoFloat;
import com.iteso.strategy2.Lifesaver;

/**
 * Created by GeraCruz on 22/09/15.
 */
public class SwimBelts extends Lifesaver {
    public SwimBelts(){
        setiFloatBehavior(new DoFloat());
        setiDeflateBehavior(new Deflatable());
        setType("Swim Belts");
    }
}
