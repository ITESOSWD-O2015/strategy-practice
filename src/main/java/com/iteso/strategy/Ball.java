package com.iteso.strategy;

import com.iteso.strategy.behaviors.iBounceBehavior;
import com.iteso.strategy.behaviors.iDeflateBehavior;
import com.iteso.strategy.behaviors.iFloatBehavior; //change

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
    private iFloatBehavior iFloatBehavior;  //change
    protected String type;

    protected Ball() {
    }

    public String roll() {
        return type + " is rolling!";
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

    public String performFloat() { return getiFloatBehavior().ifloat(); }  //Change












    // agregamos getters y set ters de cada interfaz
    //click derecho sobre lo de arriba, refactor y encapsulate

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

    public com.iteso.strategy.behaviors.iFloatBehavior getiFloatBehavior() {
        return iFloatBehavior;
    }

    public void setiFloatBehavior(com.iteso.strategy.behaviors.iFloatBehavior iFloatBehavior) {
        this.iFloatBehavior = iFloatBehavior;
    }
}
