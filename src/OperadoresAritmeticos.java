import javax.swing.*;

public class OperadoresAritmeticos {
    public static void main(String[] args) {

        int i = 5;
        int j = 4;
        // int i = 5, j = 4; Esta es otra manera de definir estas 2 var en una sola línea (solo si son del = tipo)

        int suma = i + j;
        System.out.println("suma = " + suma);
        
        int resta = i - j;
        System.out.println("resta = " + resta);
        
        int multi = i * j;
        System.out.println("multi = " + multi);
        
        int div = i / j;
        float div2 = (float) i / j; // tengo que castear i para que me de un resultado correcto porque j e i son int
        System.out.println("div = " + div);
        System.out.println("div2 = " + div2);

        int resto = i % j;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero"));
        if ( numero % 2 == 0) {
            System.out.println("numero par = " + numero);
        } else {
            System.out.println("numero impar = " + numero);
        }



        
    }
}
