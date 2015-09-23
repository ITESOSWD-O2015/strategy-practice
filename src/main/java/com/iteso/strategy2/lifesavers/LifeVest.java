package com.iteso.strategy2.lifesavers;

import com.iteso.strategy.behaviors.impl.Deflatable;
import com.iteso.strategy.behaviors.impl.NotDeflatable;
import com.iteso.strategy2.Lifesaver;

/**
 * Created by Feelpaa on 22/09/2015.
 */
public class LifeVest extends Lifesaver {
    public LifeVest() {
        setType("Swim ring");
        setiDeflateBehavior(new Deflatable());//change
        setiDeflateBehavior(new NotDeflatable());//change

    }
}
