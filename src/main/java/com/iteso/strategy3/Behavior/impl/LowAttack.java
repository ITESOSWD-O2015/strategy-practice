package com.iteso.strategy3.Behavior.impl;

import com.iteso.strategy3.Behavior.iAttackingBehavior;
/**
 * Created by ShaSkills on 22/09/2015.
 */
public class LowAttack implements iAttackingBehavior {

    public String offense(){
        return "I dont score that much!";
    }

}
