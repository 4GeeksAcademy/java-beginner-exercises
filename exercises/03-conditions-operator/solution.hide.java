/* This is a simple Java program. */
class App
{    
    public static void main(String args[])
    {
        int number1= 1;
       
        if (number1 >0 && number1 < 10){
             System.out.println("el numero es de una sifras");
        }else{
           if (number1 > 10 && number1 < 100){
                System.out.println("el numero es de dos sifras");
           }else{
               if (number1 >= 100 && number1 < 1000){
                   System.out.println("el numero es de tres sifras");
               }else{
                   if (number1 >= 1000 && number1 < 10000){
                   System.out.println("el numero es de cuatro sifras");
               }
               }
           }
        }
    }
}
