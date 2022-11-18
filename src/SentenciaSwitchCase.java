import java.util.Scanner;

public class SentenciaSwitchCase {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese el número de mes entre 1 y 12");
        int mes = s.nextInt();
        int num = 2;
        String nombreMes = null;

        switch (mes){
            case 1:
                nombreMes = "Enero";
                break;
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                nombreMes = "Indefinido";
                break;

        }
        System.out.println("nombreMes = " + nombreMes);

        switch (num) {
            case 0:
                System.out.println("El número es cero");
                break; //con el break sacamos del switch para que no siga ejecutando el código
            case 1:
                System.out.println("El número es uno");
                break;
            case 2:
                System.out.println("El número es dos");
                break;
            case 3:
                System.out.println("El número es tres");
                break;
            default: // en caso de que no entre en ningún caso cae aquí, seria como el else del if
                System.out.println("Número desconocido");
        }

        String nombre = "Diego";
        switch (nombre){
            case "Admin":
                System.out.println("Hola " + nombre +", bienvenido");
                break;
            case "Diego":
                System.out.println("Hola " + nombre +", bienvenido");
                break;
            case "Pepe":
                System.out.println("Hola " + nombre +", bienvenido");
                break;
            default:
                System.out.println("Usuario desconocido!");
        }
    }
}
