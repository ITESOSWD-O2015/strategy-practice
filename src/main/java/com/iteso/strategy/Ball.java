package com.iteso.strategy;

import com.iteso.strategy.behaviors.iBounceBehavior;
import com.iteso.strategy.behaviors.iDeflateBehavior;
import com.iteso.strategy.behaviors.iFloatationBehavior;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/7/13
 * Time: 6:14 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Ball {
    private iBounceBehavior bounceBehavior;
    private iDeflateBehavior iDeflateBehavior;
    private iFloatationBehavior FloatationBehavior;
    private String type;

    protected Ball() {
    }

    public String roll() {
        return getType() + " is rolling!";
    }

    public String performBounce() {
        return getBounceBehavior().bounce();
    }

    public String performDeflate() {
        return getiDeflateBehavior().deflate();
    }

    public String performInflate() {
        return getiDeflateBehavior().inflate();
    }

    public String performFloatation() {
        return FloatationBehavior.floatation();
    }

    public iBounceBehavior getBounceBehavior() {
        return bounceBehavior;
    }

    public void setBounceBehavior(iBounceBehavior bounceBehavior) {
        this.bounceBehavior = bounceBehavior;
    }

    public com.iteso.strategy.behaviors.iDeflateBehavior getiDeflateBehavior() {
        return iDeflateBehavior;
    }

    public void setiDeflateBehavior(com.iteso.strategy.behaviors.iDeflateBehavior iDeflateBehavior) {
        this.iDeflateBehavior = iDeflateBehavior;
    }

    public com.iteso.strategy.behaviors.iFloatationBehavior getFloatationBehavior() {
        return FloatationBehavior;
    }

    public void setFloatationBehavior(com.iteso.strategy.behaviors.iFloatationBehavior iFloatationBehavior) {
        this.FloatationBehavior = iFloatationBehavior;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
