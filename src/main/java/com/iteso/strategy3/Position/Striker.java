package com.iteso.strategy3.Position;

import com.iteso.strategy3.Behavior.impl.HighAttack;
import com.iteso.strategy3.Behavior.impl.LowDefense;
import com.iteso.strategy3.SoccerPlayer;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class Striker extends SoccerPlayer {

    public Striker(){

        setAttack(new HighAttack());
        setDefend(new LowDefense());
        setType("Powerful striker (Cristiano Ronaldo)");


    }


}
