package com.iteso.strategy3.soccerPlayer;

import com.iteso.strategy3.Players;
import com.iteso.strategy3.behaviors.impAttack.LowAttack;
import com.iteso.strategy3.behaviors.impAttack.MediumAttack;
import com.iteso.strategy3.behaviors.impDefense.HighDefense;
import com.iteso.strategy3.behaviors.impDefense.MediumDefense;

/**
 * Created by Feelpaa on 22/09/2015.
 */
public class MidField extends Players {
    public MidField(){
        setiAttack(new MediumAttack());
        setiDefense(new MediumDefense());
        type = "Mid Guy";
    }
}
