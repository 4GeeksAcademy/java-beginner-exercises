import static org.junit.Assert.*;


public class Test{

    @org.junit.Test
    public void testAdd() {
        App _app = new App();
        double area = _app.area(5);
        double delta = 0.000001d;
        assertEquals(area, 78.53981633974483, delta);
       
    }
}
