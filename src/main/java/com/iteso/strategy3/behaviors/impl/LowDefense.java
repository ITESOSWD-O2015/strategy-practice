package com.iteso.strategy3.behaviors.impl;
import com.iteso.strategy3.behaviors.iDefendBehavior;

/**
 * Created by Aldo on 22/09/2015.
 */
public class LowDefense implements iDefendBehavior{

    public String defend() { return "I'm defending lowly"; }
}
