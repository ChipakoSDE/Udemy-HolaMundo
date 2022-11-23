import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {
    public static void main(String[] args) {

        Date fecha = new Date(); // nueva instancia de la clase Date que nos da la fecha y hora en este instante con
        // precisión de milisegundos
        System.out.println("fecha = " + fecha);

        // creamos una instancia de la clase SimpleDateFormat y pasamos como argumento el patron del formato de fecha
        // que queremos tener
        SimpleDateFormat df = new SimpleDateFormat("dd 'de' MMMM, yyyy"); // MM número del mes, MMM nombre corto,
        // MMMM nombre del mes, con comillas simples podemos agregar texto
        String fechaStr = df.format(fecha); // el método format de SimpleDateFormat devuelve la fecha formateada como un String
        System.out.println("fechaStr = " + fechaStr);
        df = new SimpleDateFormat ("dd-MM-yyyy");
        fechaStr = df.format(fecha);
        System.out.println("fechaStr = " + fechaStr);

        long j = 0;
        for (int i = 0; i < 100000000; i++) {
            j += i;
        }
        Date fecha2 = new Date();
        long tiempoFinal = fecha2.getTime() - fecha.getTime();
        System.out.println("Tiempo transcurrido en el for = " + tiempoFinal + " milisegundos");

    }
}
