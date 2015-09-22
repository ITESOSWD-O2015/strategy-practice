package com.iteso.strategy2.lifesavers;

import com.iteso.strategy.behaviors.impl.NotDeflatable;
import com.iteso.strategy2.Lifesaver;

/**
 * Created by JoseFranco on 22/09/2015.
 */
public class FloamFlots extends Lifesaver {
    public FloamFlots() {
        iDeflateBehavior = new NotDeflatable();
        type = "Floam flots";
    }
}
