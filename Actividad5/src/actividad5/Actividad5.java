package actividad5;

/**
 *
 * @author Juan Carlos Camacho
 * 13/09/2021
 */
import java.io.*;
public class Actividad5 {
public static BufferedReader entrada = new BufferedReader(new InputStreamReader(System.in));    
    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        try{
            operaciones();
         }
        catch(Exception e){
            System.out.println("Se ha ingresado un carácter no válido o intentado una división entre 0");   
        }
    }
    public static void operaciones() throws IOException{
        System.out.println("********************");
        System.out.println("*     Bienvenido   *");
        System.out.println("********************");
        int x,y,suma,resta,multiplicacion,division,modulo;
        System.out.println("Ingrese el primer número(X)");
        x = Integer.parseInt(entrada.readLine());
        System.out.println("Ingrese el segundo número(Y)");
        y = Integer.parseInt(entrada.readLine());
        suma = x+y;
        resta = x-y;
        multiplicacion = x*y;
        division = x/y;
        modulo = x%y;
        System.out.println("Primer valor (X): " + x);
        System.out.println("Segundo valor (Y): " + y);
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División : " + division);
        System.out.println("Modulo: " + modulo);
    
}
}
