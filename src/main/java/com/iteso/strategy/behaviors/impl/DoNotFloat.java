package com.iteso.strategy.behaviors.impl;
import com.iteso.strategy.behaviors.iFloatBehavior;

/**
 * Created by Sacrp on 9/22/15.
 */
public class DoNotFloat implements iFloatBehavior {

    public String toFloat() { return "I can't float"; }

}
