import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tmoshasha on 2017/04/27.
 */
public class FloatingPointClassTest {
    private FloatingPointClass floatingPointClass;
    @Before
    public void setUp() throws Exception {
        floatingPointClass = new FloatingPointClass();
    }

    @After
    public void tearDown() throws Exception {

    }

    @Test
    public void testFloats() throws Exception {
        assertEquals(1.0, floatingPointClass.floats(7, 5), 0.0);
    }
}