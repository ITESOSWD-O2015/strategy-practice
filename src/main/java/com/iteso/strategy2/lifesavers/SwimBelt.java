package com.iteso.strategy2.lifesavers;

import com.iteso.strategy.behaviors.impl.DoFloat;
import com.iteso.strategy.behaviors.impl.NotDeflatable;
import com.iteso.strategy2.Lifesaver;

/**
 * Created by GGGK4 on 22/09/2015.
 */
public class SwimBelt extends Lifesaver {

    public SwimBelt(){
    setiFloatBehavior(new DoFloat());
        setType("Swim Belt");

    }
}
