import javax.swing.*;

public class SistemasNumericos2 {
    public static void main(String[] args) {
        // JOptionPane es una clase que contiene metodos para interactuar con el usuario
        String numeroStr = JOptionPane.showInputDialog(null,"Ingrese un número entero");
        int numeroDecimal = 0; // inicializo la variable para poder utilizarla dentro y fuera del try

        // verifico que el numero ingresado sea un entero para no romper el programa
        try {
            numeroDecimal = Integer.parseInt(numeroStr);
        } catch(NumberFormatException e){
            // en caso de que el valor ingresado sea incorrecto muestro un mensaje de error
            JOptionPane.showMessageDialog(null, "Debe ingresar un número entero");
            // invoco de nuevo al método main para que el programa se vuelva a inicializar
            main(args);
            // después del main tenemos que salir para que el código que está fuera del catch no se vuelva a ejecutar
            // para esto podemos usar "return;" pero es mejor utilizar la clase System
            System.exit(0); // con el 0 como argumento le indicamos que todo ha salido bien.
        }

        /*
        Esta es la primera version, se optimiza con el codigo de abajo
        System.out.println("El numero ingresado es = " + numeroDecimal);
        System.out.println(numeroDecimal + " convertido a binario es = " + Integer.toBinaryString(numeroDecimal));
        System.out.println(numeroDecimal + " convertido a octal es " + Integer.toOctalString(numeroDecimal));
        System.out.println(numeroDecimal + " convertido a hexadecimal es = " + Integer.toHexString(numeroDecimal));

        String mensaje = "El numero ingresado es " + numeroDecimal;
        // con mensaje += concateno el valor actual de la String mensaje con el valor nuevo
        mensaje += "\nConvertido a binario es " + Integer.toBinaryString(numeroDecimal);
        mensaje += "\nConvertido a octal es " + Integer.toOctalString(numeroDecimal);
        mensaje += "\nConvertido a hexadecimal es " + Integer.toHexString(numeroDecimal);
        JOptionPane.showMessageDialog(null, mensaje);
        */

        String resultadoBinario = "\nConvertido a binario es " + Integer.toBinaryString(numeroDecimal);
        String resultadoOctal = "\nConvertido a octal es " + Integer.toOctalString(numeroDecimal);
        String resultadoHexa = "\nConvertido a hexadecimal es " + Integer.toHexString(numeroDecimal);
        String mensaje = "El numero ingresado es " + numeroDecimal;
        mensaje += resultadoBinario + resultadoOctal + resultadoHexa;
        JOptionPane.showMessageDialog(null, mensaje);

    }
}
