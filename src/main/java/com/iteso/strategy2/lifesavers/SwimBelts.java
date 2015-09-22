package com.iteso.strategy2.lifesavers;

import com.iteso.strategy.behaviors.impl.Deflatable;
import com.iteso.strategy.behaviors.impl.NotDeflatable;
import com.iteso.strategy2.Lifesaver;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class SwimBelts extends Lifesaver {

    public SwimBelts() {

        setiDeflateBehavior(new Deflatable());
        type = "Swim belts";
    }
}
