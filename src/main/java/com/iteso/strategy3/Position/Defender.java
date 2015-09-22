package com.iteso.strategy3.Position;

import com.iteso.strategy3.Behavior.impl.HighDefense;
import com.iteso.strategy3.Behavior.impl.LowAttack;
import com.iteso.strategy3.Behavior.impl.MediumAttack;
import com.iteso.strategy3.SoccerPlayer;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class Defender extends SoccerPlayer {

    public Defender(){

        setAttack(new MediumAttack());
        setDefend(new HighDefense());
        setType("Complete Defender (Sergio Ramos)");

    }

}
