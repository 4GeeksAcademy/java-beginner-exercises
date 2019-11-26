import static org.junit.Assert.*;


public class Test{

    @org.junit.Test
    public void testAdd() {
        App _app = new App();
        double final = _app.precioFinal(5);
        if (final > 0){
            assertTrue(true);
        }else{
            assertTrue(false);
        }
        
       
    }
}
