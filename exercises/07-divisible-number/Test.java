import static org.junit.Assert.*;

public class Test{


    @org.junit.Test
    public void testAdd() {
        App _app = new App();
        boolean divisible = _app.sum(5);
        
        assertTrue(divisible);
       
    }
}
