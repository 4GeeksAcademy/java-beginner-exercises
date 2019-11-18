/* This is a simple Java program. */
class App
{
    public static double area(double radio){
        return Math.PI*Math.pow(radio, 2);
    }
    public static void main(String[] args) {
 
       double radio= 5;
  
        System.out.println("El area del circulo es "+area(radio));
    }
    
}
