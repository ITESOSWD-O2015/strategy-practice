package com.iteso.strategy;

import com.iteso.strategy.behaviors.iBounceBehavior;
import com.iteso.strategy.behaviors.iDeflateBehavior;
import com.iteso.strategy.behaviors.iFloatBehavior;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/7/13
 * Time: 6:14 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Ball {
    protected iBounceBehavior bounceBehavior;
    protected iDeflateBehavior iDeflateBehavior;
    protected String type;
    private iFloatBehavior floatBehavior;


    protected Ball() {
    }

    public String roll() {
        return type + " is rolling!";
    }

    public String performBounce() {
        return bounceBehavior.bounce();
    }

    public String performDeflate() {
        return iDeflateBehavior.deflate();
    }

    public String performInflate() {
        return iDeflateBehavior.inflate();
    }

    public com.iteso.strategy.behaviors.iDeflateBehavior getiDeflateBehavior() {
        return iDeflateBehavior;
    }
    public void setiDeflateBehavior(com.iteso.strategy.behaviors.iDeflateBehavior iDeflateBehavior) {
        this.iDeflateBehavior = iDeflateBehavior;
    }
    public String performFloat() { return getFloatBehavior().floating(); }
    public iFloatBehavior getFloatBehavior() {
        return floatBehavior;
    }
    public void setFloatBehavior(iFloatBehavior floatBehavior) {
        this.floatBehavior = floatBehavior;
    }
        public iBounceBehavior getBounceBehavior() {
        return bounceBehavior;
    }
    public void setBounceBehavior(iBounceBehavior bounceBehavior) {
        this.bounceBehavior = bounceBehavior;
    }
}
