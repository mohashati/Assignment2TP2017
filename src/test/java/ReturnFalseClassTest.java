import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tmoshasha on 2017/04/27.
 */
public class ReturnFalseClassTest {
private ReturnFalseClass returnFalseClass;
    @Test
    public void testFalseMethod() throws Exception {
        returnFalseClass = new ReturnFalseClass();

        assertFalse(returnFalseClass.falseMethod());
    }
}