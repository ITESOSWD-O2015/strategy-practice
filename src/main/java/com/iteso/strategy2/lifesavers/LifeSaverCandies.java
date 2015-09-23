package com.iteso.strategy2.lifesavers;

import com.iteso.strategy.behaviors.impl.Deflatable;
import com.iteso.strategy.behaviors.impl.NotDeflatable;
import com.iteso.strategy2.Lifesaver;

/**
 * Created by Feelpaa on 22/09/2015.
 */
public class LifeSaverCandies extends Lifesaver {
    public LifeSaverCandies(){
        setType("Life Saver Candies");
        setiDeflateBehavior(new NotDeflatable()); //change
        setiDeflateBehavior(new NotDeflatable());//change


    }
}

