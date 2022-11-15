import java.util.Scanner;

public class OperadoresLogicosLogin {
    public static void main(String[] args) {

        String username = "Carlos";
        String password = "12345";
        String username2 = "admin";
        String password2 = "12345";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el usuario");
        String u = scanner.nextLine();
        System.out.println("Ingrese la contraseña");
        String p = scanner.nextLine();

        boolean esAutenticado = false;

        if ( (username.equals(u) && password.equals(p)) ||
                (username2.equals(u) && password2.equals(p)) ) {
            esAutenticado = true;
        } else {
            System.out.println("Usuario o contraseña incorrectos!");
        }

        if (esAutenticado){
            System.out.println("Bienvenido usuario ".concat(u).concat("!"));
        } else {
            System.out.println("Lo siente, se requiere autenticación");

        }


    }
}
