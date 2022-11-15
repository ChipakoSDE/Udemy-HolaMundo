import java.util.Scanner;

public class OperadoresLogicosLoginOptimizado {
    public static void main(String[] args) {

        /*
        String[] usernames = new String[3]; // con el valor entre corchetes defino que va a tener 2 elementos
        String[] passwords = new String[3];
        usernames[0] = "Carlos";
        passwords[0] = "12345";
        usernames[1] = "Admin";
        passwords[1] = "12345";
        usernames[2] = "Pepe";
        passwords[2] = "12345";
        */

        // Hago lo mismo mas optimizado:
        String[] usernames = {"Carlos", "Admin", "Pepe"};
        String[] passwords = {"123", "1234", "12345"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el usuario");
        String u = scanner.nextLine();
        System.out.println("Ingrese la contraseña");
        String p = scanner.nextLine();

        boolean esAutenticado = false;

        for (int i = 0; i < usernames.length; i++) {
            if ( (usernames[i].equals(u) && passwords[i].equals(p)) ) {
                esAutenticado = true;
                break; // lo uso para salir del for y que no siga iterando una vez que cumple el if
            }
        }

        if (esAutenticado){
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else {
            System.out.println("Usuario o contraseña incorrectos!");
            System.out.println("Lo siento, se requiere autenticación");
        }


    }
}
