package com.iteso.strategy.balls;

import com.iteso.strategy.Ball;
import com.iteso.strategy.behaviors.impl.Cfloat;
import com.iteso.strategy.behaviors.impl.Deflatable;
import com.iteso.strategy.behaviors.impl.NormalBounce;
import com.iteso.strategy.behaviors.impl.NotDeflatable;

/**
 * Created by JoseFranco on 22/09/2015.
 */
public class TenisBall extends Ball {
    public TenisBall() {
        bounceBehavior = new NormalBounce();
        iDeflateBehavior = new NotDeflatable();
        iFloatBehaviors = new Cfloat();
        type = "Tenis ball";
    }
}
