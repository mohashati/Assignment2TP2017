import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tmoshasha on 2017/04/27.
 */
public class ReturnTrueClassTest {
    private ReturnTrueClass returnTrueClass;
    @Test
    public void testCheckTruth() throws Exception {
         returnTrueClass = new ReturnTrueClass();
        assertTrue(returnTrueClass.checkTruth());
    }
}