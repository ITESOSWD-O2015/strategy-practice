package com.iteso.strategy2.lifesavers;

import com.iteso.strategy.behaviors.impl.NotDeflatable;
import com.iteso.strategy2.Lifesaver;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class LifeSaversCandies extends Lifesaver{

    public LifeSaversCandies() {

        setiDeflateBehavior(new NotDeflatable());
        type = "Life Savers Candies";
    }
}
