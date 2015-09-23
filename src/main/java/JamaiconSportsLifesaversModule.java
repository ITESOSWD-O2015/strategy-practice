import com.iteso.strategy2.Lifesaver;
import com.iteso.strategy2.lifesavers.*;

import static com.iteso.strategy2.lifesavers.LifeVest.*;


/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/7/13
 * Time: 6:49 PM
 * To change this template use File | Settings | File Templates.
 */
class JamaiconSportsLifesaversModule {
    public static void main (String[] args) {
        Lifesaver swimRing = new SwimRing();
        Lifesaver swimSeat = new SwimSeat();
        Lifesaver armBands = new ArmBands();
        Lifesaver FoanFloats = new FoanFloats(); //change
        Lifesaver LifeSaverCandies = new LifeSaverCandies(); //change
        Lifesaver SwimBelts = new SwimBelts(); //change
        Lifesaver WaterTubes = new WaterTubes(); //change
        Lifesaver LifeVest = new LifeVest(); //change



        System.out.println(swimRing.display());
        System.out.println(swimRing.performDeflate());//change
        System.out.println(swimRing.performInflate()); //change
        System.out.println(swimRing.floating());

        System.out.println();

        System.out.println(swimSeat.display());
        System.out.println(swimSeat.performDeflate());//change
        System.out.println(swimSeat.performInflate()); //change
        System.out.println(swimSeat.floating());

        System.out.println();

        System.out.println(armBands.display());
        System.out.println(swimSeat.performDeflate());//change
        System.out.println(swimSeat.performInflate()); //change
        System.out.println(armBands.floating());

        ///////////////////////////////////////////////////////////////////////////change


        System.out.println();

        System.out.println(FoanFloats.display());
        System.out.println(FoanFloats.performDeflate());//change
        System.out.println(FoanFloats.performInflate()); //change
        System.out.println(FoanFloats.floating());


        System.out.println();

        System.out.println(LifeSaverCandies.display());
        System.out.println(LifeSaverCandies.performDeflate());//change
        System.out.println(LifeSaverCandies.performInflate()); //change
        System.out.println(LifeSaverCandies.floating());



        System.out.println();

        System.out.println(LifeVest.display());
        System.out.println(LifeVest.performDeflate());//change
        System.out.println(LifeVest.performInflate()); //change
        System.out.println(LifeVest.floating());



        System.out.println();

        System.out.println(SwimBelts.display());
        System.out.println(SwimBelts.performDeflate());//change
        System.out.println(SwimBelts.performInflate()); //change
        System.out.println(SwimBelts.floating());



        System.out.println();

        System.out.println(WaterTubes.display());
        System.out.println(WaterTubes.performDeflate());//change
        System.out.println(WaterTubes.performInflate()); //change
        System.out.println(WaterTubes.floating());


    }


}
