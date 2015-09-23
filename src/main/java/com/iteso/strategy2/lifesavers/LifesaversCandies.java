package com.iteso.strategy2.lifesavers;

import com.iteso.strategy.behaviors.impl.DoFloat;
import com.iteso.strategy.behaviors.impl.NotDeflatable;
import com.iteso.strategy2.Lifesaver;

/**
 * Created by GeraCruz on 22/09/15.
 */
public class LifesaversCandies extends Lifesaver{
    public LifesaversCandies() {
        setiFloatBehavior(new DoFloat());
        setiDeflateBehavior(new NotDeflatable());
        setType("Life Savers Candies");
    }

}