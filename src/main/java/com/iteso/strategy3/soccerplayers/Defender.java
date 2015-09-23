package com.iteso.strategy3.soccerplayers;

import com.iteso.strategy3.Soccerplayer;
import com.iteso.strategy3.behaviors.impl.HighDefense;
import com.iteso.strategy3.behaviors.impl.MediumAttack;
import com.iteso.strategy3.behaviors.impl.MediumDefense;

/**
 * Created by Aldo on 22/09/2015.
 */
public class Defender extends Soccerplayer{
    public Defender(){
        attackingBehavior = new MediumAttack();
        defendingBehavior = new HighDefense();
        type = "Defender";

    }
}
