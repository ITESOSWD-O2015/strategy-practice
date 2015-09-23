import com.iteso.strategy3.Players;
import com.iteso.strategy3.soccerPlayer.*;


/**
 * Created by Feelpaa on 23/09/2015.
 */
public class JamaiconSportsPlayersModule {
    public static void main (String[] args){

        Players Defender = new Defender();
        Players Goalkeper = new Goalkeper();
        Players MidField = new MidField();
        Players Stri = new Stri();


        System.out.println(Defender.Playing());
        System.out.println(Defender.performAttack());
        System.out.println(Defender.performDefense());

        System.out.println();

        System.out.println(Goalkeper.Playing());
        System.out.println(Goalkeper.performAttack());
        System.out.println(Goalkeper.performDefense());

        System.out.println();

        System.out.println(MidField.Playing());
        System.out.println(MidField.performAttack());
        System.out.println(MidField.performDefense());

        System.out.println();

        System.out.println(Stri.Playing());
        System.out.println(Stri.performAttack());
        System.out.println(Stri.performDefense());


    }
}//jamaicon
