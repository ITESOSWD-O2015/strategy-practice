package com.iteso.strategy3.Position;

import com.iteso.strategy3.Behavior.impl.HighAttack;
import com.iteso.strategy3.Behavior.impl.HighDefense;
import com.iteso.strategy3.Behavior.impl.MediumDefense;
import com.iteso.strategy3.SoccerPlayer;

/**
 * Created by ShaSkills on 22/09/2015.
 */
public class Midfielder extends SoccerPlayer{

    public Midfielder(){

        setAttack(new HighAttack());
        setDefend(new HighDefense());
        setType("Complete midFielder (Yaya Toure)");

    }

}
