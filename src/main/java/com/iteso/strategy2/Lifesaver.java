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

    private iDeflateBehavior iDeflateBehavior;
    private iFloatBehavior iFloatBehavior;
    private iBounceBehavior iBounceBehavior;
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

    public iBounceBehavior getiBounceBehavior() {
        return iBounceBehavior;
    }

    public void setiBounceBehavior(iBounceBehavior iBounceBehavior) {
        this.iBounceBehavior = iBounceBehavior;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public com.iteso.strategy.behaviors.iFloatBehavior getiFloatBehavior() {return iFloatBehavior;
    }

    public void setiFloatBehavior(com.iteso.strategy.behaviors.iFloatBehavior iFloatBehavior) {this.iFloatBehavior = iFloatBehavior;
    }


    public com.iteso.strategy.behaviors.iDeflateBehavior getiDeflateBehavior() {
        return iDeflateBehavior;
    }

    public void setiDeflateBehavior(com.iteso.strategy.behaviors.iDeflateBehavior iDeflateBehavior) {
        this.iDeflateBehavior = iDeflateBehavior;
    }
}
