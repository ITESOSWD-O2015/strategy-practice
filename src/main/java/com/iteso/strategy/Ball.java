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
    private iBounceBehavior bounceBehavior;
    private iDeflateBehavior iDeflateBehavior;
    private iFloatBehavior iFloatBehavior;
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

    public iBounceBehavior getBounceBehavior() {
        return bounceBehavior;
    }

    public void setBounceBehavior(iBounceBehavior bounceBehavior) {
        this.bounceBehavior = bounceBehavior;
    }

    public iDeflateBehavior getiDeflateBehavior() {
        return iDeflateBehavior;
    }

    public void setiDeflateBehavior(iDeflateBehavior iDeflateBehavior) {
        this.iDeflateBehavior = iDeflateBehavior;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public iFloatBehavior getiFloatBehavior() {
        return iFloatBehavior;
    }

    public void setiFloatBehavior(iFloatBehavior iFloatBehavior) {
        this.iFloatBehavior = iFloatBehavior;
    }
}
