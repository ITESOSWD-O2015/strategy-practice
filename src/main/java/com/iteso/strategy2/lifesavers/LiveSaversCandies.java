package com.iteso.strategy2.lifesavers;

import com.iteso.strategy.behaviors.impl.NotDeflatable;
import com.iteso.strategy.behaviors.impl.Superflatable;
import com.iteso.strategy2.Lifesaver;

/**
 * Created by JoseFranco on 22/09/2015.
 */
public class LiveSaversCandies extends Lifesaver {
    public LiveSaversCandies() {
        iDeflateBehavior = new NotDeflatable();
        type = "Live Savers Candies";
    }
}
