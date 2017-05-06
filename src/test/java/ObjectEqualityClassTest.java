import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by tmoshasha on 2017/04/27.
 */
public class ObjectEqualityClassTest {
private ObjectEqualityClass objectEqualityClass;
    @Before
    public void setUp() throws Exception {
        objectEqualityClass = new ObjectEqualityClass();
    }

    @After
    public void tearDown() throws Exception {
    }


    @Test
    public void testGender() throws Exception {


       assertEquals(objectEqualityClass.myName(),objectEqualityClass.hisName());

    }
}