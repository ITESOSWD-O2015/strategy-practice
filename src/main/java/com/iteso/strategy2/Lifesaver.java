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

    private iFloatBehavior iFloatBehavior;
    private iDeflateBehavior iDeflateBehavior;
    private iBounceBehavior iBounceBehavior;

    protected Lifesaver(){

    }


   

    public com.iteso.strategy.behaviors.iFloatBehavior getiFloatBehavior() {
        return iFloatBehavior;
    }

    public void setiFloatBehavior(com.iteso.strategy.behaviors.iFloatBehavior iFloatBehavior) {
        this.iFloatBehavior = iFloatBehavior;
    }

    public com.iteso.strategy.behaviors.iDeflateBehavior getiDeflateBehavior() {
        return iDeflateBehavior;
    }

    public void setiDeflateBehavior(com.iteso.strategy.behaviors.iDeflateBehavior iDeflateBehavior) {
        this.iDeflateBehavior = iDeflateBehavior;
    }

    public com.iteso.strategy.behaviors.iBounceBehavior getiBounceBehavior() {
        return iBounceBehavior;
    }

    public void setiBounceBehavior(com.iteso.strategy.behaviors.iBounceBehavior iBounceBehavior) {
        this.iBounceBehavior = iBounceBehavior;
    }
}
