package com.iteso.strategy.behaviors.impl;

import com.iteso.strategy.behaviors.iFloatBehavior;

/**
 * Created by jose luis on 22/09/2015.
 */
public class DontFloat implements iFloatBehavior {

    public String floating(){
        return "I dont float";
    }
}
