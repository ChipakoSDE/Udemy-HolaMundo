import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class EjemploJavaUtilDateParse {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
        System.out.println("Ingrese una fecha con el siguiente formato (DD-MM-YYYY)");
        try {
            Date fecha = format.parse(s.next());
            System.out.println("fecha = " + fecha);
            System.out.println("Con formato = " + format.format(fecha));

            Date fecha2 = new Date(); //fecha actual
            System.out.println("fecha2 = " + fecha2);

            if (fecha.after(fecha2)) {
                System.out.println("La fecha ingresada es posterior a la fecha actual");
            } else if (fecha.before(fecha2)) {
                System.out.println("La fecha ingresada es anterior a la fecha actual");
            } else if (fecha.equals(fecha2)) {
                System.out.println("La fecha ingresada es igual a la fecha actual");
            }

            if(fecha.compareTo(fecha2) > 0) {
                System.out.println("La fecha ingresada es posterior a la fecha actual");
            } else if (fecha.compareTo(fecha2) < 0) {
                System.out.println("La fecha ingresada es anterior a la fecha actual");
            } else if (fecha.compareTo(fecha2) == 0) {
                System.out.println("La fecha ingresada es igual a la fecha actual");
            }

        } catch (ParseException e) {
            System.out.println("Por favor ingrese la fecha con el formato solicitado");
            main(args);

        }
    }
}
