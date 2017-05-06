import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tmoshasha on 2017/04/27.
 */
public class ThrowExceptionClassTest {
    private ThrowExceptionClass throwExceptionClass;
    @Test
    public void testMethod1() throws Exception {
        throwExceptionClass = new ThrowExceptionClass();
        assertNotEquals(1, throwExceptionClass.method1(-1));
    }
}
