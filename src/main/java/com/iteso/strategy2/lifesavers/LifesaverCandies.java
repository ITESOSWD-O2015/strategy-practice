package com.iteso.strategy2.lifesavers;

import com.iteso.strategy.behaviors.impl.NotDeflatable;
import com.iteso.strategy2.Lifesaver;

/**
 * Created by GeovaniSerrano on 9/22/15.
 */
public class LifesaverCandies extends Lifesaver {
    public LifesaverCandies() {
        setType("Lifesaver Candies");
        setDeflateBehavior(new NotDeflatable());
    }
}
