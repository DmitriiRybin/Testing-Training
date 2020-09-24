package First;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTest {
    @Test
    public void TestSum() {
        Unit s = new Unit();
        Assert.assertEquals(s.Sum(5, 5), 10);
    }
    @Test
    public void TestText() {
        Unit s = new Unit();
        Assert.assertEquals(Unit.TestText(), "HelloWorld");
    }
    @Test
    public void TestSum2() {
        Unit s = new Unit();
        Assert.assertNotEquals(s.Sum2(2, 2), 5);
    }
    @Test
    public void TestText2() {
        Unit s = new Unit();
        Assert.assertNotEquals(Unit.TestText2(), "ПриветМир");
    }
}
