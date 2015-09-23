package com.iteso.strategy2.lifesavers;

import com.iteso.strategy.behaviors.impl.Deflatable;
import com.iteso.strategy.behaviors.impl.DoFloat;
import com.iteso.strategy2.Lifesaver;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/9/13
 * Time: 12:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class SwimSeat extends Lifesaver {
    public SwimSeat() {
        setiFloatBehavior(new DoFloat());
        setiDeflateBehavior(new Deflatable());
        setType("Swim seat");
    }
}

