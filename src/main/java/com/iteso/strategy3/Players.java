package com.iteso.strategy3;


import com.iteso.strategy3.behaviors.iAttack;
import com.iteso.strategy3.behaviors.iDefense;

/**
 * Created by Feelpaa on 22/09/2015.
 */
public abstract class Players {

    private iAttack iAttack;
    private iDefense iDefense;
    protected String type;

    protected Players(){
    }

    public String Playing() {
        return getType() + " is playing!";
    }

    public String performAttack() { return getiAttack().iattack();}
    public String performDefense(){return getiDefense().idefense();}





//get y set

    public com.iteso.strategy3.behaviors.iAttack getiAttack() {
        return iAttack;
    }

    public void setiAttack(com.iteso.strategy3.behaviors.iAttack iAttack) {
        this.iAttack = iAttack;
    }

    public com.iteso.strategy3.behaviors.iDefense getiDefense() {
        return iDefense;
    }

    public void setiDefense(com.iteso.strategy3.behaviors.iDefense iDefense) {
        this.iDefense = iDefense;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}//players
