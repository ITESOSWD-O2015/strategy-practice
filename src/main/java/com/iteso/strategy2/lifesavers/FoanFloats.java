package com.iteso.strategy2.lifesavers;

import com.iteso.strategy.behaviors.impl.Deflatable;
import com.iteso.strategy.behaviors.impl.NotDeflatable;
import com.iteso.strategy2.Lifesaver;

/**
 * Created by GeovaniSerrano on 9/22/15.
 */
public class FoanFloats extends Lifesaver {
    public FoanFloats() {
        setType("Foan Floats");
        setDeflateBehavior(new NotDeflatable());
    }
}
