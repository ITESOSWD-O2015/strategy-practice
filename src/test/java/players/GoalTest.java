package players;
import com.iteso.strategy3.soccerPlayer.Goalkeper;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by Feelpaa on 23/09/2015.
 */
public class GoalTest {
    @Test
    public void testGoal(){
        Goalkeper goalkeper = new Goalkeper();
        assertEquals("I'm have a  Strong defense insecto  !",Goalkeper.performAttack());
    }

}
