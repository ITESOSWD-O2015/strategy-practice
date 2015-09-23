package strategy2;

import com.iteso.strategy2.lifesavers.SwimBelts;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by jose luis on 23/09/2015.
 */
public class SwinBeltsTest {
    @Test
    public void swimbelttest(){
        SwimBelts swimbelts = new SwimBelts();
        assertEquals("I'm deflating", swimbelts.deflating());
        assertEquals("I'm inflating", swimbelts.inflating());
        assertEquals("I'm a SwimBelts", swimbelts.display());
    }
}