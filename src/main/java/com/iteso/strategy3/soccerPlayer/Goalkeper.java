package com.iteso.strategy3.soccerPlayer;

import com.iteso.strategy3.Players;
import com.iteso.strategy3.behaviors.impAttack.LowAttack;
import com.iteso.strategy3.behaviors.impDefense.HighDefense;

/**
 * Created by Feelpaa on 22/09/2015.
 */
public class Goalkeper extends Players {
    public Goalkeper(){
        setiAttack(new LowAttack());
        setiDefense(new HighDefense());
        type = "Goal Guy";

    }
}
