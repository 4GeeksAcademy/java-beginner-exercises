/* This is a simple Java program. */
class App
{

    public static void condicion(Integer num1, Integer num2){
       if (num1>=num2){
            //If anidado
            if(num1==num2){
                System.out.println("Los numeros "+num1+" y "+num2+" son iguales");
            }else{
                System.out.println("El número "+num1+" es mayor que el número "+num2);
            }
        }else{
            System.out.println("El número "+num2+" es mayor que el número "+num1);
        }
    }

	public static void main(String[] args) {
		 
        //Declaramos las variables
        int num1=10;
        int num2=5;
 
        condicion(num1,num2);
    }
    
}
