package com.iteso.strategy2.lifesavers;

import com.iteso.strategy.behaviors.impl.NotDeflatable;
import com.iteso.strategy2.Lifesaver;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/9/13
 * Time: 12:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class LifeSaversCandies extends Lifesaver {
    public LifeSaversCandies() {
        iDeflateBehavior = new NotDeflatable();
        type = "Life Savers Candies";
    }

}
