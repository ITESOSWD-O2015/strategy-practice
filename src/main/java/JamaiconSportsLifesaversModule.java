import com.iteso.strategy2.Lifesaver;
import com.iteso.strategy2.lifesavers.*;


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
        System.out.println(swimRing.floating());

        System.out.println();

        System.out.println(swimSeat.display());
        System.out.println(swimSeat.floating());

        System.out.println();

        System.out.println(armBands.display());
        System.out.println(armBands.floating());
    }
}
