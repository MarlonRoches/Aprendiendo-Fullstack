package Java;

import java.util.Scanner;
class HolaMundo {
    
    public static void main (String[] aStrings) 
    {
        //comentarios jeje
        System.out.println("Hola Mundo :D");
        System.out.println("Dame usn numero papu:");
        var entrada = new Scanner(System.in);
        var leer = entrada.next();

        System.out.println("Esto es lo ingresado: "+leer);

    }


}