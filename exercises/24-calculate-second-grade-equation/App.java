/* This is a simple Java program. */
class App
{
    public static void main(String[] args) {
 
        int a = 5;
        int b = 6;
        int c= 8; 

        double discriminante=Math.pow(b, 2)-(4*a*c);
  
        //Mensaje de traza
        System.out.println(">>"+discriminante);
  
        if (discriminante>0){
            //Tambien se puede hacer por parte si lo ves más facil
            //recuerda que debes tener en cuenta la prioridad de elementos
            double x1=((b*(-1))+Math.sqrt(discriminante))/(2*a);
            double x2=((b*(-1))-Math.sqrt(discriminante))/(2*a);
  
            System.out.println("El valor de x1 es "+x1+" y el valor de x2 es "+x2);
        }else{
            System.out.println("El discriminante es negativo");
        }
    }
    
}
