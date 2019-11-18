/* This is a simple Java program. */
class App
{    
    public static void main(String args[])
    {
       String original = "el zorro juega muy rapido";       
       String r1 = original.replace("zoro","perro");
       String resultado = r1.replace("rapido","lento");
       System.out.println(resultado);       
    }
}
