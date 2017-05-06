import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tmoshasha on 2017/04/27.
 */
public class ObjectIdentityClassTest {

    ObjectIdentityClass objectIdentityClass;

    @Before
    public void setUp() throws Exception {
        objectIdentityClass = new ObjectIdentityClass();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testEquality() throws Exception {
        assertSame(objectIdentityClass.objectSecond(), objectIdentityClass.objectFirst());

    }
}