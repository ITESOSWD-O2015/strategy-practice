package com.iteso.strategy2.lifesavers;

import com.iteso.strategy.behaviors.impl.Deflatable;
import com.iteso.strategy.behaviors.impl.DoFloat;
import com.iteso.strategy.behaviors.impl.Superflatable;
import com.iteso.strategy2.Lifesaver;

/**
 * Created by GGGK4 on 22/09/2015.
 */
public class LifeVest extends Lifesaver {

    public LifeVest(){
        setiFloatBehavior(new DoFloat());
        setType("Life Vest");
    }
}
