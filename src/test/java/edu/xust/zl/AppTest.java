package edu.xust.zl;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    App app;

    @Before
    public void setUp() throws Exception {
        app = new App();
    }

    @Test
    public void testApp() throws Exception {
        Assert.assertEquals("Hello World!",app.hello());
    }
}
