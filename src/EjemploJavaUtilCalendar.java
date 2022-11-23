import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class EjemploJavaUtilCalendar {
    public static void main(String[] args) {
        Calendar calendario = Calendar.getInstance(); // esta clase es abstracta no se puede instanciar con el "new"
        // calendario.set(2022,03, 10, 18, 21);
        // calendario.set(2022,Calendar.APRIL, 10, 18, 21);
        // el mes inicia en 0, por lo que siempre se le resta uno al nro del mes, para evitar confusiones se puede
        // colocar el mes como una constante colocando Calendar.MONTH (el nombre del mes en ingles)

        //esto también se puede hacer pasando todos los valores como campos separados
        calendario.set (Calendar.YEAR, 1980);
        // igual que antes, para el mes se puede pasar el nro (iniciando en 0) o llamando a la constante
        calendario.set (Calendar.MONTH, Calendar.APRIL);
        calendario.set(Calendar.DAY_OF_MONTH, 10);

        calendario.set(Calendar.HOUR_OF_DAY,19); // puedo usar también Calendar.HOUR y se pasa la hora de 0 a 12 + am o pm
        /*
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        */
        calendario.set(Calendar.MINUTE, 35);
        calendario.set(Calendar.SECOND, 28);
        calendario.set(Calendar.MILLISECOND, 135);

        Date fecha = calendario.getTime(); // nos trae la fecha con precisión de milisegundos
        System.out.println("Fecha sin formato: " + fecha);

        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss:SSS a");
        String fechaConFormato = formato.format(fecha);
        System.out.println("Fecha con formato = " + fechaConFormato);
        
    }
}
