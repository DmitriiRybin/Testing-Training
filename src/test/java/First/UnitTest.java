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
        Assert.assertEquals(s.TestText(), "HelloWorld");
    }
}
