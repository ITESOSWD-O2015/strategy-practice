package com.iteso.strategy3.soccerplayers;

import com.iteso.strategy3.Soccerplayer;
import com.iteso.strategy3.behaviors.impl.HighAttack;
import com.iteso.strategy3.behaviors.impl.HighDefense;
import com.iteso.strategy3.behaviors.impl.LowDefense;
import com.iteso.strategy3.behaviors.impl.MediumAttack;

/**
 * Created by Aldo on 22/09/2015.
 */
public class Striker extends Soccerplayer{
    public Striker(){
        attackingBehavior = new HighAttack();
        defendingBehavior = new LowDefense();
        type = "Striker";

    }
}
