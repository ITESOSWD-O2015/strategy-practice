package com.iteso.strategy2.lifesavers;

import com.iteso.strategy.behaviors.impl.NotDeflatable;
import com.iteso.strategy2.Lifesaver;

/**
 * Created by JoseFranco on 22/09/2015.
 */
public class LifeVests extends Lifesaver {
    public LifeVests(){
        iDeflateBehavior = new NotDeflatable();
        type = "Life vests";}
}
