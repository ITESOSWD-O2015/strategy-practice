package com.iteso.strategy3;

import com.iteso.strategy3.Behavior.iAttackingBehavior;
import com.iteso.strategy3.Behavior.iDefendingBehavior;


/**
 * Created by ShaSkills on 22/09/2015.
 */
public abstract class SoccerPlayer {

    private iAttackingBehavior attack ;
    private iDefendingBehavior defend;
    private String type;

    public SoccerPlayer(){
    }

    public String player() {return getType() + " is a player!";}

    public String performAttack() {return getAttack().offense();}

    public String performDefense() {return getDefend().defense();}



    public iAttackingBehavior getAttack() {
        return attack;
    }

    public void setAttack(iAttackingBehavior attack) {
        this.attack = attack;
    }

    public iDefendingBehavior getDefend() {
        return defend;
    }

    public void setDefend(iDefendingBehavior defend) {
        this.defend = defend;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
