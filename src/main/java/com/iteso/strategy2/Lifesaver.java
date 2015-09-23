package com.iteso.strategy2;

import com.iteso.strategy.behaviors.iBounceBehavior;
import com.iteso.strategy.behaviors.iDeflateBehavior;
import com.iteso.strategy.behaviors.iFloatBehavior;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/9/13
 * Time: 10:56 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Lifesaver {
    private iBounceBehavior iBounceBehavior;
    private iDeflateBehavior iDeflateBehavior;
    private iFloatBehavior iFloatBehavior;
    private String type;

    public String floating() {
        return "I'm floating";
    }

    public String display() {
        return "I'm a " + getType();
    }

    public String performDeflate() {
        return getiDeflateBehavior().deflate();
    }

    public String performInflate() {
        return getiDeflateBehavior().inflate();
    }

    public String performFloat() {
        return getiFloatBehavior().Float();
    }

    public iBounceBehavior getiBounceBehavior() {
        return iBounceBehavior;
    }

    public void setiBounceBehavior(iBounceBehavior iBounceBehavior) {
        this.iBounceBehavior = iBounceBehavior;
    }

    public iDeflateBehavior getiDeflateBehavior() {
        return iDeflateBehavior;
    }

    public void setiDeflateBehavior(iDeflateBehavior iDeflateBehavior) {
        this.iDeflateBehavior = iDeflateBehavior;
    }

    public iFloatBehavior getiFloatBehavior() {
        return iFloatBehavior;
    }

    public void setiFloatBehavior(iFloatBehavior iFloatBehavior) {
        this.iFloatBehavior = iFloatBehavior;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
