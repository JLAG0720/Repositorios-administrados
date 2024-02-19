package excepciones;
import java.util.Scanner;
import java.util.InputMismatchException;
/**
 * Esta clase realiza una division
 * @author Joel Abraham Lechuga Guiterrez
 */
public class Excepciones {

    /**
     * 
     * @param args Arreglo con los parametros que se reciban por consola
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println();
        //Metodo para realizar la division
        try{
        int numerador, denominador, resultado;
        System.out.println("Digite el numerador: ");
        numerador = sc.nextInt();
        System.out.println("Digite el denominador: ");
        denominador = sc.nextInt();
        resultado = numerador/denominador;
        System.out.println("El resultado es: "+resultado);
        //Metodo para manejar una excepcion
        } catch (ArithmeticException ae){
            System.out.println("No se puede dividir en cero");
        }    catch (InputMismatchException ime){
            System.out.println("Debe digitar solo numeros enteros");
                 
        }
        }
    }