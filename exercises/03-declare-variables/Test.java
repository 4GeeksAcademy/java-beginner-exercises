import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Test{

    @org.junit.Test
    public void testAdd() {
        App _app = new App();
        Integer result = _app.sum(1,3);
        System.out.println(result.toString());
        //String str = "Junit is workingfefefeer fine";
        //assertEquals("Junit is work ing fine",str);
        double delta = 0.000001d;
        assertEquals(result, 4, delta);
    }
}
