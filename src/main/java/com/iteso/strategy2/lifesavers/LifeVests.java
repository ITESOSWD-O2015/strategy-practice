package com.iteso.strategy2.lifesavers;

import com.iteso.strategy.behaviors.impl.Deflatable;
import com.iteso.strategy2.Lifesaver;

/**
 * Created by GeovaniSerrano on 9/22/15.
 */
public class LifeVests extends Lifesaver {
    public LifeVests() {
        setType("Life Vests");
        setDeflateBehavior(new Deflatable());
    }
}
