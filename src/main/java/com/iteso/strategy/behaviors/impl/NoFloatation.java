package com.iteso.strategy.behaviors.impl;

import com.iteso.strategy.behaviors.iFloatationBehavior;

/**
 * Created by GeovaniSerrano on 9/22/15.
 */
public class NoFloatation implements iFloatationBehavior {
    public String floatation() {
        return "I'm not floating";
    }
}
