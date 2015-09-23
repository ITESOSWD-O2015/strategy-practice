package com.iteso.strategy2.lifesavers;

import com.iteso.strategy.behaviors.impl.DoFloat;
import com.iteso.strategy.behaviors.impl.NotDeflatable;
import com.iteso.strategy.behaviors.impl.PartTimeFloat;
import com.iteso.strategy2.Lifesaver;

/**
 * Created by GeraCruz on 22/09/15.
 */
public class FoamFloats extends Lifesaver {
    public FoamFloats () {
        setiFloatBehavior(new PartTimeFloat());
        setiDeflateBehavior(new NotDeflatable());
        setType("Foam Floats");
    }

}
