/* This is a simple Java program. */
class App
{    
    public static void main(String args[])
    {
        int dado1= 1;
        int dado2= 1;
        int dado3= 1;
       
        if (dado1 == 6 && dado2 == 6 && dado3 == 6){
             System.out.println("EXCELENTE");
        }else{
           if ((dado1 == 6 && dado2 == 6) || (dado1 == 6 && dado3 == 6) || (dado2 == 6 && dado3 == 6)) {
                System.out.println("MUY BIEN");
           }else{
                if (dado1 == 6 || dado2 == 6 || dado3 == 6){
                   System.out.println("REGULAR");
               }else{
                   
                    if (dado1 != 6 && dado2 != 6 && dado3 != 6){
                        System.out.println("PESIMO");
                    }
               }
           }
        }
    }
}
