import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        
        // variable = condicion ? value_if_true : value_if_false;
        String variable = 7 == 5 ? "verdad" : "mentira"; // analiza la condición y devuelve valor
        System.out.println("variable = " + variable);

        String estado = "";
        double promedio = 6.2;

        double matematicas = 0.0;
        double ciencias = 0.0;
        double historia = 0.0;

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese la nota de Matemáticas");
        matematicas = s.nextDouble();

        System.out.println("Ingrese la nota de Ciencias");
        ciencias = s.nextDouble();

        System.out.println("Ingrese la nota de Historia");
        historia = s.nextDouble();

        promedio = (matematicas + ciencias + historia) / 3;

        // System.out.printf("Su promedio es = %.2f ", promedio); // limito el resultado a 2 decimales
        System.out.println(String.format("Su promedio es = %.2f", promedio)); // limito el resultado a 2 decimales

        estado = promedio >= 5.49 ? "Aprobado" : "Rechazado"; // es un equivalente al if-else
        System.out.println("Estado = " + estado);



    }
}
