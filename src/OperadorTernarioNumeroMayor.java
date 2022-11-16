import java.util.Scanner;

public class OperadorTernarioNumeroMayor {
    public static void main(String[] args) {

        int max = 0;

        Scanner s = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num1 = s.nextInt();

        System.out.println("Ingrese segundo número");
        int num2 = s.nextInt();

        System.out.println("Ingrese tercer número");
        int num3 = s.nextInt();

        System.out.println("Ingrese cuarto número");
        int num4 = s.nextInt();

        max = (num1 > num2) ? num1 : num2;
        max = (max > num3) ? max : num3;
        max = (max > num4) ? max : num4;

        System.out.println("El número mayor es = " + max);
    }
}
