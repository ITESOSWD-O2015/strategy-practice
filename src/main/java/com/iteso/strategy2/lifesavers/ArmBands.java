package com.iteso.strategy2.lifesavers;

import com.iteso.strategy.behaviors.impl.Deflatable;
import com.iteso.strategy.behaviors.impl.NotDeflatable;
import com.iteso.strategy2.Lifesaver;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/9/13
 * Time: 12:22 PM
 * To change this template use File | Settings | File Templates.
 */
public class ArmBands extends Lifesaver {
    public ArmBands() {
        setType("Arm bands");
        setiDeflateBehavior(new Deflatable()); //change
        setiDeflateBehavior(new NotDeflatable());//change

    }


}
//agregar al testisng los que estan en fb (clases)
/*
crear los testing para cada caso de los deflaviors
 */