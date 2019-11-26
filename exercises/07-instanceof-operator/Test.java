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
        

        int string_=outContent.toString().indexOf("String");
        int double_=outContent.toString().indexOf("Double");
        int boolean_=outContent.toString().indexOf("Boolean");
        int long_=outContent.toString().indexOf("Long");
        int integer_=outContent.toString().indexOf("Integer");
       
        if (string_ > 0){
            assertTrue(true);
        }else{
            assertTrue(false);
        }
        if (double_ > 0){
            assertTrue(true);
        }else{
            assertTrue(false);
        }
        if (boolean_ > 0){
            assertTrue(true);
        }else{
            assertTrue(false);
        }
        if (long_ > 0){
            assertTrue(true);
        }else{
            assertTrue(false);
        }
        if (integer_ > 0){
            assertTrue(true);
        }else{
            assertTrue(false);
        }
    }
   
}
