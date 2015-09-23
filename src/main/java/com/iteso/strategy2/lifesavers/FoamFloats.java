package com.iteso.strategy2.lifesavers;

import com.iteso.strategy.behaviors.impl.DoFloat;
import com.iteso.strategy.behaviors.impl.NotDeflatable;
import com.iteso.strategy.behaviors.impl.PartTimeFloat;
import com.iteso.strategy2.Lifesaver;

/**
 * Created by GGGK4 on 22/09/2015.
 */
public class FoamFloats extends Lifesaver {

    public FoamFloats(){
        setiFloatBehavior(new PartTimeFloat());
        setType("Foam Float");
    }
}
