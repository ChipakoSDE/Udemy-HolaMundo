public class PasarPorValor {
    public static void main(String[] args) {

        int i = 10; // toda variable primitiva siempre se pasa por valor.
        // Si lo definimos como Integer i = 10 pasamos por referencia, pero las clases wrapper son inmutables, no cambian
        // su valor, porque generan una nueva instancia del objeto (esto solo pasa con las clases wrapper
        System.out.println("Iniciamos el main con i = " + i);
        test (i);
        System.out.println("Finaliza el método main con i (se mantiene igual) = " + i);

    }

    public static void test(int i) {
        System.out.println("Iniciamos el método test con i = " + i);
        i = 35;
        System.out.println("Finaliza el método test con el nuevo valor de i = " + i);

    }
}
