package strategy2;

import com.iteso.strategy2.lifesavers.WaterTubes;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by jose luis on 23/09/2015.
 */
public class WaterTubesTest {
    @Test
    public void waterttest(){
        WaterTubes watertubes = new WaterTubes();
        assertEquals("I can't deflate!", watertubes.iDeflateBehavior.deflate());
        assertEquals("I can't inflate!", watertubes.iDeflateBehavior.inflate());
        assertEquals("I'm a Water Tube", watertubes.display());
    }
}