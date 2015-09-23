package com.iteso.strategy2;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.iDeflateBehavior;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/9/13
 * Time: 10:56 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Lifesaver extends Ball{
    private String type;
    private iDeflateBehavior iDeflateBehavior;

    public Lifesaver(){
    }


    public String performDeflate() {return getiDeflateBehavior().deflate();}
    public String floating() {return "I'm floating";}
    public String display() {
        return "I'm a " + getType();
    }

    @Override
    public com.iteso.strategy.behaviors.iDeflateBehavior getiDeflateBehavior() {
        return iDeflateBehavior;
    }

    @Override
    public void setiDeflateBehavior(com.iteso.strategy.behaviors.iDeflateBehavior iDeflateBehavior) {
        this.iDeflateBehavior = iDeflateBehavior;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }
}
