package com.iteso.strategy3.Position;

import com.iteso.strategy3.Behavior.impl.HighDefense;
import com.iteso.strategy3.Behavior.impl.LowAttack;
import com.iteso.strategy3.SoccerPlayer;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class Goalkeeper extends SoccerPlayer {

    public Goalkeeper(){

        setAttack(new LowAttack());
        setDefend(new HighDefense());
        setType("Im a Goalkeeper like Casillas");


    }
}
