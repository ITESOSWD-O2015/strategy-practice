package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.*;

/**
 * Created by GeovaniSerrano on 9/22/15.
 */
public class QuidditchBall extends Ball {
    public QuidditchBall() {
        setBounceBehavior(new NormalBounce());
        setiDeflateBehavior(new NotDeflatable());
        setType("Quidditch Ball");
        setFloatationBehavior(new PoorFloatation());
    }
}
