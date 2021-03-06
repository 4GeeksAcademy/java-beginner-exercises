import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Test{

   private PrintStream sysOut;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @org.junit.Before
    public void setUpStreams() {
        sysOut = System.out;
        System.setOut(new PrintStream(outContent));
    }

    @org.junit.After
    public void revertStreams() {
        System.setOut(sysOut);
    }

    @org.junit.Test
    public void testAdd() {
        App a = new App();
        a.main(new String[0]);
        
        String[] valor = {"Lunes","Martes","Miercoles","Jueves","Viernes","Sabado","Domingo"};
        int c= 0;
        for (int i = 0; i < valor.length; i++) {
			if (valor[i].equalsIgnoreCase(outContent.toString())) {
				c++;
			}
		}
        if (c > 0){
            assertTrue(true);
        }else{
            assertTrue(false);
        }
    }
}
