/* This is a simple Java program. */
class App
{
    public static boolean divisible(int numero){
         if (numero%2==0){
            return true;
        }else{
           return false;
        }
    }
    public static void main(String[] args) {
        
        int numero =5;
        if (divisible(numero)){
            System.out.println("El numero "+numero+" es divisible entre 2");
        }else{
            System.out.println("El numero "+numero+" no es divisible entre 2");
        }
    }
    
}
