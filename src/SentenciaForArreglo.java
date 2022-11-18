import javax.swing.*;

public class SentenciaForArreglo {
    public static void main(String[] args) {

        String[] nombres = {"Carlos", "Pepa", "Miguel", "Paco", "Maria", "Alberto", "Beatriz", "Lalo"};
        int count = nombres.length; // es buena practica utilizar una variable contador, porque se evalua una sola vez
        for (int i = 0; i < count ; i++) {
            if ( (nombres[i].equalsIgnoreCase("carlos"))
                || (nombres[i].equalsIgnoreCase("pepa")) ) {
                continue;

            }
            System.out.println(i + " - " + nombres[i]);
        }

        String buscar = JOptionPane.showInputDialog("Ingrese un nombre");
        System.out.println("buscar = " + buscar);

        boolean encontrado = false;
        for (int i = 0; i < count; i++){
            if (nombres[i].equalsIgnoreCase(buscar)) {
                encontrado = true;
                break;
            }
            System.out.println("Nombres = " + nombres[i]); // imprime los nombres hasta que encuentra el buscado
        }
        if(encontrado) {
            JOptionPane.showMessageDialog(null, buscar + " fue encontrado");
        } else {
            JOptionPane.showMessageDialog(null, buscar + " no existe en el sistema");
        }
    }
}


