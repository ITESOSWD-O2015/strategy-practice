package com.iteso.strategy2.lifesavers;

import com.iteso.strategy.behaviors.impl.Deflatable;
import com.iteso.strategy.behaviors.impl.NotDeflatable;
import com.iteso.strategy2.Lifesaver;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class WaterTubes  extends Lifesaver{

    public WaterTubes() {

        setiDeflateBehavior(new Deflatable());
        type = "Water Tubes";
    }
}
