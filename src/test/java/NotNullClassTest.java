import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runners.Parameterized;

import java.util.Collection;

import static org.junit.Assert.*;

/**
 * Created by tmoshasha on 2017/04/27.
 */
public class NotNullClassTest {

    private NotNullClass notNullClass;

    @Before
    public void setUp() throws Exception {

        notNullClass = new NotNullClass();

    }

    @After
    public void tearDown() throws Exception {


    }
    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return null;
    }
    @Test
    public void testNotNullMessage() throws Exception {
        assertNotNull(notNullClass.notNullMessage());
    }
}