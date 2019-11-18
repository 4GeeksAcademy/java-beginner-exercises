import static org.junit.Assert.assertEquals;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Test{

     @org.junit.Test
    public void testAdd() {
        App _app = new App();
        Integer suma = _app.sum(1,3);
        Integer resta = _app.resta(3,1);
        Integer division = _app.division(3,1);
        Integer multiplicacion = _app.multiplicacion(1,3);
        //String str = "Junit is workingfefefeer fine";
        //assertEquals("Junit is work ing fine",str);
        double delta = 0.000001d;
        assertEquals(suma, 4, delta);
        assertEquals(resta, 2, delta);
        assertEquals(division, 3, delta);
        assertEquals(multiplicacion, 3, delta);
    }
}
