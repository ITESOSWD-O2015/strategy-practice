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
    private String type;
    private iDeflateBehavior iDeflateBehavior ;


    public String performDeflate() {
        return getiDeflateBehavior().deflate();
    } //change
    public String floating() {
        return "I'm floating";
    }
    public String display() {
        return "I'm a " + getType();
    }
    public String performInflate() {
        return getiDeflateBehavior().inflate();
    }//change












    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public com.iteso.strategy.behaviors.iDeflateBehavior getiDeflateBehavior() {
        return iDeflateBehavior;
    }

    public void setiDeflateBehavior(com.iteso.strategy.behaviors.iDeflateBehavior iDeflateBehavior) {
        this.iDeflateBehavior = iDeflateBehavior;
    }


}
