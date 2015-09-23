package strategy2;

import com.iteso.strategy2.lifesavers.FoamFloats;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by jose luis on 23/09/2015.
 */
public class FoanFloatsTest {
    @Test
    public void foamfloattest(){
        FoamFloats foamfloats = new FoamFloats();
        assertEquals("I can't deflate!", foamfloats.iDeflateBehavior.deflate());
        assertEquals("I can't inflate!", foamfloats.iDeflateBehavior.inflate());
        assertEquals("I'm a Foam Float", foamfloats.display());
    }
}