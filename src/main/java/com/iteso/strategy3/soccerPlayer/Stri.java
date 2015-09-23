package com.iteso.strategy3.soccerPlayer;

import com.iteso.strategy3.Players;
import com.iteso.strategy3.behaviors.impAttack.HighAttack;
import com.iteso.strategy3.behaviors.impAttack.LowAttack;
import com.iteso.strategy3.behaviors.impDefense.HighDefense;
import com.iteso.strategy3.behaviors.impDefense.LowDefense;

/**
 * Created by Feelpaa on 22/09/2015.
 */
public class Stri extends Players {
    public Stri(){
        setiAttack(new HighAttack());
        setiDefense(new LowDefense());
        type = "Defense Guy";
    }
}
