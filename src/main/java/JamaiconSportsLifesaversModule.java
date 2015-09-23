import com.iteso.strategy2.lifesavers.ArmBands;
import com.iteso.strategy2.Lifesaver;
import com.iteso.strategy2.lifesavers.SwimRing;
import com.iteso.strategy2.lifesavers.SwimSeat;


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

        System.out.println(swimRing.display());
        System.out.println(swimRing.performInflate());
        System.out.println(swimRing.performDeflate());
        System.out.println(swimRing.floating());

        System.out.println();

        System.out.println(swimSeat.display());
        System.out.println(swimSeat.performInflate());
        System.out.println(swimSeat.performDeflate());
        System.out.println(swimSeat.floating());

        System.out.println();

        System.out.println(armBands.display());
        System.out.println(armBands.performInflate());
        System.out.println(armBands.performDeflate());
        System.out.println(armBands.floating());
    }
}
