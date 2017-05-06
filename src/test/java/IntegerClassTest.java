import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tmoshasha on 2017/04/27.
 */
public class IntegerClassTest {
    private IntegerClass integerCLass;
    @Before
    public void setUp() throws Exception {
        integerCLass = new IntegerClass();

    }
    @Test
    public void testAdd() throws Exception {

    }

    @Test
    public void testNumbers() throws Exception {
       assertEquals(8, integerCLass.add(4, 4));
    }
}
