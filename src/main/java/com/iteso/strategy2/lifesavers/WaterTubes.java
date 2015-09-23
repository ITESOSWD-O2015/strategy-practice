package com.iteso.strategy2.lifesavers;

import com.iteso.strategy.behaviors.impl.NotDeflatable;
import com.iteso.strategy2.Lifesaver;

/**
 * Created by jose luis on 23/09/2015.
 */
public class WaterTubes extends Lifesaver {
    public WaterTubes(){
        iDeflateBehavior = new NotDeflatable();
        type = "Water Tube";
    }
}