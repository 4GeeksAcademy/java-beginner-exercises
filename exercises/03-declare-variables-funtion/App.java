/* This is a simple Java program. */
class App
{

    public static Integer sum(Integer a, Integer b){
        return a+b;
    }

    public static Integer resta(Integer a, Integer b){
        return a-b;
    }
    public static Integer multiplicacion(Integer a, Integer b){
        return a*b;
    }
    public static Integer division(Integer a, Integer b){
        return a/b;
    }

	public static void main(String[] args) {
		 
        //Declaramos las variables
        int num1=10;
        int num2=5;
 
        /*Realizamos las operaciones.
        */
        System.out.println("El resultado de la suma es "+sum(num1,num2));
 
        System.out.println("El resultado de la resta es "+resta(num1,num2));
 
        System.out.println("El resultado de la multiplicacion es "+multiplicacion(num1,num2));
 
        System.out.println("El resultado de la division es "+division(num1,num2));
    }
    
}
