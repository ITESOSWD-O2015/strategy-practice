package com.iteso.strategy3.soccerplayers;

import com.iteso.strategy3.Soccerplayer;
import com.iteso.strategy3.behaviors.impl.HighAttack;
import com.iteso.strategy3.behaviors.impl.HighDefense;
import com.iteso.strategy3.behaviors.impl.LowAttack;
import com.iteso.strategy3.behaviors.impl.LowDefense;

/**
 * Created by Aldo on 22/09/2015.
 */
public class GoalKeeper extends Soccerplayer{
    public GoalKeeper(){
        attackingBehavior = new LowAttack();
        defendingBehavior = new HighDefense();
        type = "Goalkeeper";

    }
}
