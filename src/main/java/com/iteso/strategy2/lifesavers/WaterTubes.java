package com.iteso.strategy2.lifesavers;

import com.iteso.strategy.behaviors.impl.DoFloat;
import com.iteso.strategy2.Lifesaver;

/**
 * Created by GGGK4 on 22/09/2015.
 */
public class WaterTubes extends Lifesaver {
    public WaterTubes(){

        setiFloatBehavior(new DoFloat());
        setType("Water Tube");
    }
}
