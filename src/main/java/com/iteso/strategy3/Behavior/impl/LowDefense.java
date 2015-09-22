package com.iteso.strategy3.Behavior.impl;

import com.iteso.strategy3.Behavior.iDefendingBehavior;
/**
 * Created by ShaSkills on 22/09/2015.
 */
public class LowDefense implements iDefendingBehavior {

    public String defense(){
        return "I defend poorly :(";
    }
}
