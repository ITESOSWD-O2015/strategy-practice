import com.iteso.strategy.Ball;
import com.iteso.strategy.balls.*;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 8/7/13
 * Time: 6:49 PM
 * To change this template use File | Settings | File Templates.
 */
class JamaiconSportsBallModule {
    public static void main (String[] args) {
        Ball soccer = new SoccerBall();
        Ball base = new BaseballBall();
        Ball american = new AmericanFootballBall();

        /////////////////////////////////////////////////////// Change

        Ball billar = new BillarBall();
        Ball Bowling = new BowlingBall();
        Ball Demolition = new DemolitionBall();
        Ball Secret = new SecretBall();
        Ball Tennis = new TennisBall();
        //////////////////////////////////////////////////////////


        System.out.println(soccer.roll());
        System.out.println(soccer.performBounce());
        System.out.println(soccer.performDeflate());
        System.out.println(soccer.performInflate());
        System.out.print(soccer.performFloat()); //change

        System.out.println();

        System.out.println(american.roll());
        System.out.println(american.performBounce());
        System.out.println(american.performDeflate());
        System.out.println(american.performInflate());
        System.out.print(american.performFloat()); //change



        System.out.println();

        System.out.println(base.roll());
        System.out.println(base.performBounce());
        System.out.println(base.performDeflate());
        System.out.println(base.performInflate());
        System.out.print(base.performFloat()); //change



        /////////////////////////////////////////////////////// Change
        System.out.println();

        System.out.println(Bowling.roll());
        System.out.println(Bowling.performBounce());
        System.out.println(Bowling.performDeflate());
        System.out.println(Bowling.performInflate());
        System.out.print(Bowling.performFloat()); //change


        System.out.println();

        System.out.println(billar.roll());
        System.out.println(billar.performBounce());
        System.out.println(billar.performDeflate());
        System.out.println(billar.performInflate());
        System.out.print(billar.performFloat()); //change

        System.out.println();

        System.out.println(Demolition.roll());
        System.out.println(Demolition.performBounce());
        System.out.println(Demolition.performDeflate());
        System.out.println(Demolition.performInflate());
        System.out.print(Demolition.performFloat()); //change


        System.out.println();

        System.out.println(Secret.roll());
        System.out.println(Secret.performBounce());
        System.out.println(Secret.performDeflate());
        System.out.println(Secret.performInflate());
        System.out.print(Secret.performFloat()); //change


        System.out.println();

        System.out.println(Tennis.roll());
        System.out.println(Tennis.performBounce());
        System.out.println(Tennis.performDeflate());
        System.out.println(Tennis.performInflate());
        System.out.print(Secret.performFloat()); //change


    }
}
