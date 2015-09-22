package com.iteso.strategy2;

import com.iteso.strategy.behaviors.iDeflateBehavior;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/9/13
 * Time: 10:56 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Lifesaver {
    private iDeflateBehavior deflateBehavior;
    private String type;
    public String inflating() {
        return getDeflateBehavior().inflate();
    }
    public String deflating() {
        return getDeflateBehavior().deflate();
    }
    public String floating() {
        return "I'm floating";
    }
    public String display() {
        return "I'm a " + getType();
    }

    public iDeflateBehavior getDeflateBehavior() {
        return deflateBehavior;
    }

    public void setDeflateBehavior(iDeflateBehavior deflateBehavior) {
        this.deflateBehavior = deflateBehavior;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
