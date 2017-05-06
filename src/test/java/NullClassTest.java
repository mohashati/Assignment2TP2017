import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tmoshasha on 2017/04/27.
 */
public class NullClassTest {
    private NullClass nullClass;

    @Before
    public void setUp() throws Exception {
        nullClass = new NullClass();

    }

    @After
    public void tearDown() throws Exception {


    }

    @Test
    public void testNullMessage() throws Exception {
        assertNull(nullClass.nullMessage());
    }
}