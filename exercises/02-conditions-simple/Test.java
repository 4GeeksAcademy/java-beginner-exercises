import static org.junit.Assert.*;
import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.io.IOException;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
public class Test{

    private PrintStream sysOut;
    private InputStream sysIn;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    // private Mockery context = new Mockery();
    @org.junit.Before
    public void setUpStreams() throws IOException{
      sysOut = System.out;
      System.setOut(new PrintStream(outContent));

      sysIn = System.in;
      System.setIn(new ByteArrayInputStream("44".getBytes()));
    }

    @org.junit.After
    public void revertStreams() {
        System.setOut(sysOut);
        System.setIn(sysIn);
    }

    @org.junit.Test
    public void testAdd() throws IOException{

      try
      {
        App a = new App();
        a.main(new String[0]);
      }
      catch(Exception superException){
        //error handling code
        System.out.println("Exception occurred"+superException.toString());
      }
      //String str = "Junit is workingfefefeer fine";
      assertEquals("is old enough\n", outContent.toString());
    }
}