package strategy2;

import com.iteso.strategy2.lifesavers.ArmBands;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by jose luis on 23/09/2015.
 */
public class ArmBandTest {
    @Test
    public void armbandtest(){
        ArmBands armband = new ArmBands();
        assertEquals("I'm deflating", armband.deflating());
        assertEquals("I'm inflating", armband.inflating());
        assertEquals("I'm a Arm bands", armband.display());
    }
}
