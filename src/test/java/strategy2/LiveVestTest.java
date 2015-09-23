package strategy2;

import com.iteso.strategy2.lifesavers.LifeVest;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
/**
 * Created by jose luis on 23/09/2015.
 */
public class LiveVestTest {
    @Test
    public void lifevesttest(){
        LifeVest lifevest = new LifeVest();
        assertEquals("I can't inflate!", lifevest.iDeflateBehavior.inflate());
        assertEquals("I can't deflate!", lifevest.iDeflateBehavior.deflate());
        assertEquals("I'm a LifeVests", lifevest.display());
    }
}
