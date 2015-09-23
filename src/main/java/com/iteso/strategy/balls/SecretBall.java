package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.*;
import com.iteso.strategy.behaviors.impl.Float;

/**
 * Created by Feelpaa on 22/09/2015.
 */
public class SecretBall extends Ball {
    public SecretBall(){
        setBounceBehavior(new NormalBounce());
        setiDeflateBehavior(new Deflatable());
        setiFloatBehavior(new Float());
        type = "Secret Ball";
    }
}
