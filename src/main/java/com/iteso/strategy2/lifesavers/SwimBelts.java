package com.iteso.strategy2.lifesavers;

import com.iteso.strategy.behaviors.impl.Superflatable;
import com.iteso.strategy2.Lifesaver;

/**
 * Created by JoseFranco on 22/09/2015.
 */
public class SwimBelts extends Lifesaver {
    public SwimBelts() {
        iDeflateBehavior = new Superflatable();
        type = "Swim Belts";
    }
}
