/* This is a simple Java program. */
import java.io.BufferedReader;  
import java.io.InputStreamReader;  
import java.io.IOException;  
class App
{    
    public static void main(String args[])
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in)); 
        try{
            String entrada = reader.readLine();   
            System.out.println(entrada);
        }
        catch(IOException e){
            //nada
            System.err.println(e.toString());
        }

    }
}
