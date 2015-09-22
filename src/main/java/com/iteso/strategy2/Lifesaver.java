package com.iteso.strategy2;

import com.iteso.strategy.behaviors.iBounceBehavior;
/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/9/13
 * Time: 10:56 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Lifesaver {
    private iBounceBehavior iBounceBehavior;
    private String type;

    public String floating() {
        return "I'm floating";
    }
    public String display() {
        return "I'm a " + getType();
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
}
