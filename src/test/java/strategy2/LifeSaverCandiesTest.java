package strategy2;

import com.iteso.strategy2.lifesavers.LifeSaverCandies;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by jose luis on 23/09/2015.
 */
public class LifeSaverCandiesTest {
    @Test
    public void lifesavercandytest(){
        LifeSaverCandies lifesavercandies = new LifeSaverCandies();
        assertEquals("I'm deflating" , lifesavercandies.deflating());
        assertEquals("I'm inflating", lifesavercandies.inflating());
        assertEquals("I'm a Life Saver Candies", lifesavercandies.display());
    }
}