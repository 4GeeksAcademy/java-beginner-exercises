/* This is a simple Java program. */
import java.io.BufferedReader;
import java.io.InputStreamReader;
class App
{    
    public static void main(String args[])
    {
        try{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
            int edad = Integer.parseInt(reader.readLine());   

            if(edad > 21){
                System.out.println("is old enough");
            }
            else{
                System.out.println("not old enough");
            }
            // tu codigo aqui

        }
        catch(Exception e){
            // if you have any errors, this line will print the error in the console 
            System.out.println(e.toString());
        }
    }
}
