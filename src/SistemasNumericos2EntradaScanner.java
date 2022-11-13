import java.util.InputMismatchException;
import java.util.Scanner;

public class SistemasNumericos2EntradaScanner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // instanciamos la clase Scanner que es una clase que viene definida en Java
        // System.in recibe datos como entrada desde la consola
        System.out.println("Ingrese un número entero:");
        // String numeroStr = scanner.nextLine(); // obtenemos la línea del terminal que el usuario ingresa
        int numeroDecimal = 0; // inicializo la variable para poder utilizarla dentro y fuera del try
        // verifico que el numero ingresado sea un entero para no romper el programa
        try {
            numeroDecimal = scanner.nextInt(); //Integer.parseInt(numeroStr), puedo obtenerlo de esta manera sin usar
            // el scanner.nextLine()
        } catch (InputMismatchException e) {  //(NumberFormatException e) como no uso un numero, va con InputMismatchException
            // en caso de que el valor ingresado sea incorrecto muestro un mensaje de error
            System.out.println("Debe ingresar un número entero");
            // invoco de nuevo al método main para que el programa se vuelva a inicializar
            main(args);
            // después del main tenemos que salir para que el código que está fuera del catch no se vuelva a ejecutar
            // para esto podemos usar "return;" pero es mejor utilizar la clase System
            System.exit(0); // con el 0 como argumento le indicamos que todo ha salido bien.
        }
        String resultadoBinario = "\nConvertido a binario es " + Integer.toBinaryString(numeroDecimal);
        String resultadoOctal = "\nConvertido a octal es " + Integer.toOctalString(numeroDecimal);
        String resultadoHexa = "\nConvertido a hexadecimal es " + Integer.toHexString(numeroDecimal);
        String mensaje = "El numero ingresado es " + numeroDecimal;
        mensaje += resultadoBinario + resultadoOctal + resultadoHexa;
        System.out.println(mensaje);

    }
}
