package com.iteso.strategy.behaviors.impl;

import com.iteso.strategy.behaviors.iFloatBehavior;
/**
 * Created by GeraCruz on 22/09/15.
 */
public class NotFloat implements iFloatBehavior {
    public String Float() {
        return "Don't Float!";
    }
}
