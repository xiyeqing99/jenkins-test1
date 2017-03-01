/**
 * Created by xiyeqing on 2017-二月-27.
 */

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import other.TestNG;
//import junit.framework.Assert;

public class TestMain {
    private TestNG m = null;
    @BeforeMethod
    public void init(){
        m = new TestNG();
    }
    @Test
    public void testSayHello(){
        Assert.assertEquals(m.sayHello(),"Hallo Welt!");
    }

    @Test
    public void testSayHello1(){
        Assert.assertEquals(m.sayHello(),"Hallo Welt!");
    }
}
