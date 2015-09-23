package com.iteso.strategy3;
import com.iteso.strategy3.behaviors.iDefendBehavior;
import com.iteso.strategy3.behaviors.iAttackBehavior;

/**
 * Created by Aldo on 22/09/2015.
 */
public abstract class Soccerplayer {
    protected iAttackBehavior attackingBehavior;
    protected iDefendBehavior defendingBehavior;
    protected String type;

    protected Soccerplayer(){};

    public String run(){
        return type + " is running";
    }
    public String performAttack(){ return attackingBehavior.attack(); }
    public String performDefense() { return defendingBehavior.defend(); }


}
