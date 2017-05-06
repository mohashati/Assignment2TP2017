import org.junit.*;

import static org.junit.Assert.*;

/**
 * Created by tmoshasha on 2017/04/27.
 */
public class FailingClassTest {

    @org.junit.Test
    public void testWrong() throws Exception {
        FailingClass failingClass = new FailingClass();
        Assert.fail(failingClass.wrong());
    }
}