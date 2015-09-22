package com.iteso.strategy2;
import com.iteso.strategy.behaviors.iDeflateBehavior;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/9/13
 * Time: 10:56 AM
 * To change this template use File | Settings | File Templates.
 */
public abstract class Lifesaver{

    protected iDeflateBehavior iDeflateBehavior;
    protected String type;
    public String performDeflate() {
        return iDeflateBehavior.deflate();
    }
    public String performInflate() {
        return iDeflateBehavior.inflate();
    }
    public String floating() {
        return "I'm floating";
    }
    public String display() {
        return "I'm a " + type;
    }
}
